package two.pointers;

// QS : find 3Sum Closest

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {
    static void findClosestSum(int[] nums, int target){
        int n = nums.length;
        Arrays.sort(nums);
        int minDiff = 999999999;
        int closestSum = 0;
        for(int i = 0; i < n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - sum);
                    if(diff < minDiff){
                        minDiff = diff;
                        closestSum = sum;
                    }
                if(sum == target){
                    System.out.println("Closest Sum for target: " + target
                            + " is " + closestSum);
                    return;
                }
                else if(sum > target){
                    right--;
                }else {
                    left++;
                }
            }
        }
        System.out.println(
                "Closest Sum for target: " + target + " is " + closestSum
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target here: ");
        int target = sc.nextInt();

        findClosestSum(nums, target);

        sc.close();
    }
}
