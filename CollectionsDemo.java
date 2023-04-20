import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        Laptop dell = new Laptop(60000, 8, true);
        Laptop lenova = new Laptop(40000, 4, false);
        ArrayList laptop = new ArrayList();
        laptop.add(dell);
        laptop.add(lenova);
        Collections.sort(laptop);
        ComparatorDemo cd = new ComparatorDemo();
        Collections.sort(laptop, cd);
        System.out.println(laptop);
/*
        ArrayList al = new ArrayList();
        al.add('z');
        al.add('f');
        al.add('b');
        al.add('w');
        System.out.println("Before Sorting : " + al);
        Collections.sort(al);
        System.out.println("After Sorting : " + al);
        System.out.println(Collections.binarySearch(al, 'b'));
        System.out.println(Collections.binarySearch(al, 'u'));
*/

    }
}
