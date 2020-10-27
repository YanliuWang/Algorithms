package bubblesort;

/**
 * @author yanliu
 * @create 2020-09-15-20:23
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length-1; ++i) {
            boolean sortedFlag = false;

            for (int j = 0; j < arr.length-1-i; ++j) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    sortedFlag = true;
                }

                if (sortedFlag == false) {
                    break;
                }
            }

        }

    }

}
