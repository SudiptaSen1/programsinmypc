import java.util.*;
class LlWork {
    Node head;
    private int size;
    LlWork(){
        this.size=0;
    }
    class Node{
        int n;
        Node next;
        Node(int n){
            this.n=n;
            this.next=null;
            size++;
        }
    }
    public void addFirst(int n){
        Node newNode=new Node(n);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int n){
        Node newNode=new Node(n);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.n+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    //finding index of a list element
    /*public void findIndex(int n){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        int i=0;
        Node currNode=head;
        if(currNode.n == n){
            System.out.println("1");
        }
        boolean f=false;
        while(currNode != null){
            i++;
            currNode=currNode.next;
        if(currNode == null){
            break;
        }
        if(currNode.n == n){
                f=true;
                System.out.print(currNode.n+","+"index="+i+"\n");
            }
        }
        if(f==false){
            System.out.println("Element not present in the list:");
        }
        
    }*/
    //Kinky Desi Teacher Is Ready To Risk It All To Have Sex With His Favorite Student porn video
    //finding index in a list of elements type-2
    public void findIndex(int n,int s){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        boolean flag=false;
        for(int i=0;i<=s;i++){
            if(currNode==null){
                break;
            }
            if(currNode.n == n){
                flag=true;
                System.out.println(currNode.n+","+"index="+i);
            }
            currNode=currNode.next;
        }
        if(flag==false){
            System.out.println("Element not present in the list");
        }
    }
    public static void main(String[] args){
        LlWork list=new LlWork();
        list.addFirst(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.addLast(7);
        list.printList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched in the list:");
        int n=sc.nextInt();
        int s=list.getSize();
        list.findIndex(n, s);
       // list.findIndex(n);
        sc.close();
    }
}
