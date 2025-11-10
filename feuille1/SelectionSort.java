import java.util.Random;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIdx = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[minIdx]) minIdx = j;
            }
            int tmp = a[minIdx]; a[minIdx] = a[i]; a[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random(0);
        for (int i=0;i<a.length;i++) a[i]=r.nextInt(100);
        System.out.println("Before: "+Arrays.toString(a));
        selectionSort(a);
        System.out.println("After:  "+Arrays.toString(a));
    }
}
