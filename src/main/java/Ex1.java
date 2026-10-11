import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotate(arr, 2, arr.length)));
        System.out.println(Arrays.toString(rotate(arr, 7, arr.length)));
        System.out.println(Arrays.toString(rotate(arr, 0, arr.length)));
        int[] smallArr = {10, 20, 30};
        System.out.println(Arrays.toString(rotate(smallArr, 1, smallArr.length)));
    }
    //ex1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
    public static int[] rotate(int[] arr, int d, int n) {
        int[] tempArr = new int[n];
        //to Handle cases where d > n
        int shiftCount = d % n;
        for (int i=0; i<n; i++) {
            int shiftIndex = (i+shiftCount)%n;
            tempArr[i] = arr[shiftIndex];
        }
        //not sure if you want the same array. but if you do we can just loop again and put the tempArr values into the old arr again
        return tempArr;
    }
}
