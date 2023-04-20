package collections;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        /* 1. ArrayList is resizalbe.
           2. ArrayList is heterogenous objects are allowed.
           3. Data structure - Growable/dynamic array
         */
        ArrayList al = new ArrayList();
        al.add(15);
        al.add(30);
        al.add(5);
        al.add(20);
        al.add('a');
        al.add("anjana");
        al.add(false);   // array is heterogeneous(different) so it allows different data types
        al.add(3, "Anju");
//        System.out.println(al.contains('o'));
//        System.out.println(al.get(4));
//        System.out.println(al.remove(6));
//        System.out.println(al.add(45));
        al.set(3, "Anjana");
//        System.out.println("Index : " + al.indexOf("Anjana"));
        System.out.println(al);
        ArrayList al2 = new ArrayList();
        al2.addAll(al);
        System.out.println("al2 list is : "+al2 );
        ArrayList al3 = new ArrayList();
        al3.add("Mumbai");
        al3.add("Chennai");
        al3.add("Kolkata");
        System.out.println("als list is : "+al3);
    }
}
