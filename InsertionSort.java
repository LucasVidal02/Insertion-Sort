
public class InsertionSort {
    public void insertionSort(int arr[], int n) {
        int i, ult, j;
        for (i = 1; i < n; i++) {
            ult = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > ult) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = ult;
        }
    }
}