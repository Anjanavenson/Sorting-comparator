import java.util.Arrays;

public class ArrayBasics {
    String name;
    public ArrayBasics(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int[] a={10,20,30};
        int[] b={20,10,30};
        Arrays.sort(b);
        String[] names={"Deepika", "Anjana", "Snega"};
        Arrays.sort(names);
        for (int i=0; i<b.length;i++)
            System.out.println(names[i]);
        ArrayBasics a1=new ArrayBasics("Deepika");
        ArrayBasics a2=new ArrayBasics("Anjana");
        ArrayBasics a3=new ArrayBasics("Snega");
        ArrayBasics[] ab = {a1,a2,a3};
//        Arrays.sort(ab);
//        for (int i=0; i<ab.length;i++)
//            System.out.println(ab[i]);
    }
}
