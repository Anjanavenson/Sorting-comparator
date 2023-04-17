import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] a1={10,20,30};
        int[] a2={40,20,30};
        System.out.println(Arrays.equals(a1,a2));
        Arrays.sort(a2);
        for (int i=0; i<a2.length;i++)
            System.out.println(a2[i]);
    }
}
