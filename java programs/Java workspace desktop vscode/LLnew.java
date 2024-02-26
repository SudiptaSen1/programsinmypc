import java.util.*;
public class LLnew {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        //list.addLast("List");
        list.add("list");//adds last
        list.addFirst("This");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.print("null");
        list.removeFirst();
        System.out.println("\n"+list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
