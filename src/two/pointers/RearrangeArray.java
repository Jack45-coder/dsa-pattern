package two.pointers;

import java.util.Scanner;

// Dutch National Flag Algorithm
public class RearrangeArray {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void rearrange(int[] arr){
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else { // arr[mid] == 2
                swap(arr, mid,  high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        rearrange(arr);
        printArray(arr);

        input.close();
    }
}
