import java.util.Arrays;
/*
每个数往前看，如果前面还有小的，就交换
类似打扑克牌 插牌
 */
public class Code6_04_InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 1, 4, 9};
        print(arr);
        insertSort(arr);
        print(arr);
    }

    private static void insertSort(int[] arr) {
        int n = arr.length ;
        for (int i=0; i< n; i++){
            for (int j=i;j>0;j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
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
