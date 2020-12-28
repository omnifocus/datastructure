import java.util.Arrays;

public class Code4_07_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 1, 4, 9};
        print(arr);
        selectionSort(arr);
        print(arr);
    }

    /*
    先在第一个位置上放最小的数，第一个数挨个跟剩下的数比较
    再在第二个位置上放第二小的数，第二个数按个跟剩下的数比较
     */
    private static void selectionSort(int[] arr) {
        //检查边界
        if (arr == null || arr.length < 2) {
            return;
        }

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < n; j++) {
                minValueIndex = arr[minValueIndex] > arr[j] ? j : minValueIndex;
            }
            if (minValueIndex != i) {
                swap(arr,minValueIndex,i);
            }
        }
    }

    private static void swap(int[] arr, int minValueIndex, int i) {
        arr[minValueIndex] = arr[minValueIndex] ^ arr[i];
        arr[i] = arr[minValueIndex] ^ arr[i];
        arr[minValueIndex] = arr[minValueIndex] ^ arr[i];
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
