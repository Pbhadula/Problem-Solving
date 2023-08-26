import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements in array :");
        int n = s.nextInt();
        System.out.println("Enter array element :");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }


        int[] arr1 = getReverseArray(arr);

        Arrays.stream(arr1).forEach(System.out::println);
    }

    public static int[] getReverseArray(int[] arr) {
        int i=0;
        int j= arr.length-1;

        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return arr;
    }
}
