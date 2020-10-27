package selectsort;

import edu.princeton.cs.algs4.StdIn;
import utils.SortUtils;

/**
 * @author yanliu
 * @create 2020-10-27-14:12
 */
public class Selection {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; ++i) {
            int min = i;

            for (int j = i+1; j < a.length; ++j) {
                if (SortUtils.less(a[j], a[min])) {
                    min = j;
                }
            }

            SortUtils.swap(a, min, i);
        }
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        SortUtils.show(a);
        sort(a);
        System.out.println("after sorting...");
        SortUtils.show(a);

    }
}
