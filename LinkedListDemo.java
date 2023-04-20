import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(20);
        ll.add(5);
        ll.add("Anjana");
        ll.add(true);
        ll.add(30);
        ll.addFirst(100);
        System.out.println("Before Poll :" + ll);
        System.out.println(ll.poll());
        System.out.println("After Poll :" + ll);
        ll.offer(50);
        System.out.println("After Offer :" + ll);
        ll.offerFirst(500);
        System.out.println("After OfferFirst :" + ll);
        ll.offerLast(5000);
        System.out.println("After OfferLast :" + ll);
//        ll.clear();
//        System.out.println("After clear :" + ll);
        LinkedList ll2= (LinkedList) ll.clone();
        System.out.println("Cloned object :" + ll2);
    }
}
