import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]={6,2,17,11,3,10};  //primitive data types
        for (int i:arr){
            System.out.println(i);
        }
        Arrays.sort(arr);
        System.out.println("After sorting");
        for (int i:arr){
            System.out.println(i);
        }
        String[] names={"swassthika","anjana","kaviya","deepika","snega"};  // non-primitive data types
        System.out.println("Before sorting");
        for (String s : names){
            System.out.println(s);
        }
        Arrays.sort(names);
        System.out.println("After sorting");
        for (String s: names)
            System.out.println(s);
        Comparator comp = new Comparator();
        Arrays.sort(names,comp);
        System.out.println("After compare method usage");
        for (String s: names)
            System.out.println(s);
    }

}