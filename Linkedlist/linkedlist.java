import java.util.*;
public class linkedlist {
    
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addLast(4);
        list.addFirst(0);
        System.out.println(list);
        list.removeIf(x->x%2==0);
        LinkedList<String>Animals=new LinkedList<>(Arrays.asList("cat","dog","rat"));
        LinkedList<String>Animalstoremove=new LinkedList<>(Arrays.asList("dog"));
        Animals.removeAll(Animalstoremove);
        System.out.println(Animals);

    }
}
