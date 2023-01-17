public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,11,23,44,56,76,81,100};
        int[] arr2 = {100,81,76,56,44,23,11,8,5,3,2,1};
        int target = 8;
        System.out.println(searchIndex(arr, target));
    }

    public static int searchIndex (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]){
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
