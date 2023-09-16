import java.util.Arrays;

public class FirstLastPositionElementInSortedArray {

    static int [] searchRange(int [] arr, int target) {
        int[] res = {-1, -1};
        int start = 0;
        int end = arr.length - 1;
        int middle;

        //left position
        while (start <= end) {
            middle = start + (end - start)/2;
            if (target == arr[middle]) {
                res[0] = middle;
                end = middle - 1;
            }
            else if (target < arr[middle]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }

        start = 0;
        end = arr.length - 1;
        //right position
        while(start <= end) {
            middle = start + (end - start)/2;
            if (target == arr[middle]) {
                res[1] = middle;
                start = middle + 1;
            }
            else if (target > arr[middle]) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 11;
        int[] res = searchRange(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
