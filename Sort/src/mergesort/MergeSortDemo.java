package mergesort;

/**
 * @author yanliu
 * @create 2020-09-15-22:00
 */
public class MergeSortDemo {
    public static void mergeSort(int[] arr) {
        _mergeSort(arr, 0, arr.length-1);
    }

    private static void _mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            _mergeSort(arr, l, m);
            _mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }

    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] subArr1 = new int[n1];
        int[] subArr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            subArr1[i] = arr[l+i];
        }

        for (int i = 0; i < n2; i++) {
            subArr2[i] = arr[m+1+i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (subArr1[i] < subArr2[j]) {
                arr[k] = subArr1[i];
                i++;
            } else {
                arr[k] = subArr2[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = subArr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = subArr2[j];
            j++;
            k++;

        }

    }
}
