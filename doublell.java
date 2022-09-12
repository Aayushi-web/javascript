public class doublell {
   public  class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
this.data= data;
this.next=null;
this.prev= null;
    }
   }
   public static Node head;
   public static Node tail;
   public static int size;
   //add 
   public void  addfirst(int data){
    Node newNode= new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
    head= newNode; 
   }
   // print
   public void print(){
    Node temp=head;
    
    while(temp!=null){
       
        System.out.print(temp.data+"<==>");
        temp=temp.next;
        size++;
    }
    System.out.println("null");
   }
    public static void main(String[] args) {
        doublell dll= new doublell();
        dll.addfirst(5);
        dll.addfirst(8);
        dll.addfirst(7);
        dll.print();
      System.out.println(dll.size);
    }
}
