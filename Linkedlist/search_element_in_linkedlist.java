public class search_element_in_linkedlist {
    public boolean search(Node node1,int key){
        
    }
    public static void main(String[] args) {
        int key=3;
        // 1->2->3
        Node node1=new Node();
        node1.data=1;
        Node node2=new Node();
        node2=node1.next;
        node2.data=2;
        Node node3=new Node();
        node3=node2.next;
        node3.data=3;

        if(search(node1,key)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
class Node{
    int data;
    Node next;
}
