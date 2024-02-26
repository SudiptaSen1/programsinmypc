class LL {

    Node head;
    private int size;
    
    LL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //adding at first of the list
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    //adding at last of the list
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        } 

        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //deleting the first element of the list
    public void deleteFirst(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //deleting the last element of the list
    public void deleteLast(){
        if(head == null){
            System.out.print("List is empty");
            return;
        } 
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    //printing the list
    public void printList(){
        if(head==null){
            System.out.print("List is Empty");
            return;
        } 
         Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("Null \n");
        //System.out.println();
    }
    //size
    public int getSize(){
        return size;
    }
    //iterate through a linked list
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    //reverse recursive
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
       Node newHead= reverseRecursive(head.next);
       head.next.next=head;
       head.next=null;
       return newHead;
    }
    // public Node removeNthFromEnd(Node head,int n){
    //     if(head.next==null){
    //         return null;
    //     }
    //     int size =0;
    //     Node curr=head;
    //     while(curr != null){
    //         curr=curr.next;
    //         size++;
    //     }
    //     if(n==size){
    //         return head.next;
    //     }
    //     int indextosearch=size-n;
    //     Node prev=head;
    //     int i=1;
    //     while(i<indextosearch){
    //         prev=prev.next;
    //         i++;
    //     }
    //     prev.next=prev.next.next;
    //     return head;
    // }
    //main function
    public static void main(String[] args){
        LL list=new LL();
        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("List");
        list.printList();
        //list.reverseIterate();
        list.head = list.reverseRecursive(list.head);
        list.printList();
        // list.removeNthFromEnd(null, 2);
        // System.out.println("\n"+list.getSize());
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        // System.out.println("\n"+list.getSize());
    }
    
}
