public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 67, 4, 6};
        insertionSort(arr);
        for (int e: arr){
            System.out.println(e);
        }
    }
    public static void insertionSort(int[] arr){
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]){
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
