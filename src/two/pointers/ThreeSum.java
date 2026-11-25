package two.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// QS:find pair with triplets sum == 0 => unique pair
public class ThreeSum {
    static void findUniqueTriplets(int[] nums){
        List<List<Integer>> triplets = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int st = i+1;
            int end = n-1;
            while(st < end){
                int sum = nums[i] + nums[st] + nums[end];
                if(sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[st], nums[end]));
                    st++;
                    end--;

                    while (st < end && nums[st] == nums[st - 1]) {
                        st++;
                    }
                    while (st < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }else if(sum > 0){
                    end--;
                }else {
                    st++;
                }
            }
        }

        System.out.println(triplets);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        findUniqueTriplets(arr);

        sc.close();
    }
}
