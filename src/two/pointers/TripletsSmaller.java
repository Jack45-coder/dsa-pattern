package two.pointers;
import java.util.Arrays;
import java.util.Scanner;


public class TripletsSmaller {

    // Todo Triplets with Smaller Sum
    static int tripletsPair(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i++){
            int st = i+1;
            int end = n-1;
            while(st < end){
                int sum = arr[i] + arr[st] + arr[end];
                if(sum >= target) end--;
                else { // sum < target
                    ans = ans + (end-st);
                    st++;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter SUM here:");
        int t = sc.nextInt();

        int pairs = tripletsPair(arr, t);
        System.out.println("Pairs: " + pairs);

        sc.close();
    }
}
