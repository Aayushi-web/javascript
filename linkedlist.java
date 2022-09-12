import java.util.LinkedList;
public class linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addFirst(1);
        ll.add(0, 5);
        ll.addLast(8);
        ll.addLast(0);
        System.out.println(ll);
    }
}