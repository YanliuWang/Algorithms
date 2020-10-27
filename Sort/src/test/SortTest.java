package test;

import bubblesort.BubbleSort;
import mergesort.MergeSortDemo;
import org.junit.Test;

/**
 * @author yanliu
 * @create 2020-09-15-20:29
 */
public class SortTest {
    private int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    @Test
    public void bubbleSortTest() {
        BubbleSort.bubbleSort(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.println(i + ":" + arr[i]);
        }
    }

    @Test
    public void mergeSortTest() {
        MergeSortDemo.mergeSort(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.println(i + ":" + arr[i]);
        }

    }

    @Test
    public void insertSortTest() {

    }
}
