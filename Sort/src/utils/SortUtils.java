package utils;

/**
 * @author yanliu
 * @create 2020-10-27-13:56
 */
public class SortUtils {
    public static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }

    public static void swap(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

    }

    public static boolean isSorted(Comparable[] a) {
        // we assume the ascending order is correct
        for (int i = 1; i < a.length; ++i) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }

        return true;
    }



}
