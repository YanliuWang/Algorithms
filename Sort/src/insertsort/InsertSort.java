package insertsort;

/**
 * @author yanliu
 * @create 2020-09-15-20:55
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {

            int key = arr[i];

            int j;
            for (j = i-1; j>=0; j--) {
                if (arr[j] > key) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }

            arr[j+1] = key;
        }
    }
}
