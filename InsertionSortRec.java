public class InsertionSortRec {
    public void insertionSortRecursivo(int arr[], int n){

        //caso base
        if(n <= 1){
            return;
        }

        //ordenar os primeiros n-1 elementos
        insertionSortRecursivo(arr, n-1);

        //inserir o último elemento na posição correta
        int ult = arr[n-1];
        int j = n - 2;
        
        //mover os elementos do array, que são maior que a chave, uma posição à frente da posição atual.
        while (j >= 0 && arr[j] > ult){
            arr[j + 1]  = arr[j];
            j = j - 1;
        }

        arr[j + 1] = ult;

    }
}
