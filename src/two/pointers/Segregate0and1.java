package two.pointers;

import java.util.Scanner;
/*
    Given an array arr[] consisting of only 0s and 1s,
    rearrange the array such that all the 0s appear before all the 1s.
    Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
    input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
*/
public class Segregate0and1 {
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

    static void segregate0and1(int[] arr) {
        int n = arr.length;
        int st = 0, end =  n - 1;
        while (st <= end) {
            if(arr[st] == 0){
                st++;
            }else if(arr[end] == 1){
                end--;
            }else {
                swap(arr, st, end);
                    st++;
                    end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        segregate0and1(arr);
        printArray(arr);

        input.close();
    }
}
