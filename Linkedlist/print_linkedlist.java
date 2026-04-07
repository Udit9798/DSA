class print_linkedlist{
	public static void main (String[] args) throws java.lang.Exception{
        Node node1=new Node();
        node1.data=1;
        
        Node node2=new Node();
        node1.next=node2;
        node2.data=2;
        
        Node node3=new Node();
        node2.next=node3;
        node3.data=3;
        node3.next=null;
        
        Node temp=node1;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
	}
}
class Node{
    public int data;
    public Node next;
}
