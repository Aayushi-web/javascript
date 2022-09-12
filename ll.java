package xyz;

public class ll {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
public void addfirst(int data){
    Node node= new Node(data);
    node.next=head;
    head= node;
}
    public static void main(String[] args) {
       ll newnode= new ll();
       newnode.addfirst(5);
       newnode.addfirst(8);

    }
}
