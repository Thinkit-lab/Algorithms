import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args) {
        SortingAlgo sortingAlgo = new SortingAlgo();
        System.out.println(Arrays.toString(sortingAlgo.InsertionSort(new int[]{5, 1, 2, 9, 10})));

    }

    public int[] bubbleSort(int[] arr){
        boolean isSwap;
        for(int i=0; i<arr.length-1; i++){
            isSwap = false;
            for(int j=0; j<arr.length -1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if(isSwap == false){
                break;
            }
        }
        return arr;
    }

    public int[] InsertionSort(int[] arr){
        for(int i=1; i<arr.length-1; i++){
           int temp = arr[i];
           int j = i-1;
            while ((j>=0 && arr[j] > arr[j+1])){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
