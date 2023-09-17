import java.util.Arrays;

public class FloorOfNumber {
    static int floorOfNumber (int[] arr, int target) {
//        Greatest integer less than or equal to target
//        Returns the element itself, if the index is needed
//        change arr[middle] with middle
        int start = 0;
        int end = arr.length - 1;
        int middle;
        int res = Arrays.stream(arr).min().getAsInt();

        while (start <= end) {
            if (target > arr[arr.length - 1]) {
                return -1;
            }

            middle = start + (end -  start)/2;
            if (target > arr[middle]) {
                res = Math.max(res, arr[middle]);
                start = middle + 1;
            }
            else if (target < arr[middle]) {
                end = middle - 1;
            }
            else {
                return arr[middle - 1];
            }
        }
//        return arr[end];
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 10, 14, 18, 23, 26, 32, 39, 51, 48, 54, 57, 62, 71};
        int target = 41;
        int res = floorOfNumber(arr, target);
        System.out.println(res);
    }
}
