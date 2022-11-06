
public class InsertionSort {
    public void insertionSort(int arr[], int n) {
        
        for (int i = 1; i < n; i++) {
            int ult = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > ult) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = ult;
        }
    }
}