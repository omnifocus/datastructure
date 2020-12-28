import java.util.Arrays;

public class Code5_03_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 1, 4, 9};
        print(arr);
        bubbleSort(arr);
        print(arr);
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int n = arr.length;
        // i卡的是j所能取到的最大位置-1
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
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
