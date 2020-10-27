package mergesort;

/**
 * @author yanliu
 * @create 2020-09-15-21:25
 */
public class MergeSort {
    public static void sort(int[] arr) {
        _mergeSort(arr, 0, arr.length-1);

    }

    private static void _mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;
            _mergeSort(arr, l, m);
            _mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }

    }

    private static void merge(int[] arr, int l, int m, int r) {
        // size of two subarray
        int n1 = m - l + 1;
        int n2 = r - m;

        // initialize two subarray
        int[] subArr1 = new int[n1];
        int[] subArr2 = new int[n2];

        // put value into two subarray
        for (int i = 0; i < n1; i++) {
            subArr1[i] = arr[l+i];
        }

        for (int i = 0; i < n2; i++) {
            subArr2[i] = arr[m+1+i];
        }

        // merge the two subarray
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
