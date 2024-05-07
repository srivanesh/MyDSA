package DSA;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        System.out.println("Input Array:"+ Arrays.toString(nums));
        int count =0; // Initialize return var
        if (nums.length == 0) return count; // If array length is zero return zero
        // Init the array , assume 0th position is unique
        for(int i=0; i < nums.length; i++){
            // If 0th and 1th element are same then continue, both are unique
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++; // Increment K, so it will 1 and i will be 2 in next iteration
        }
        System.out.println("Output count :"+count);
        System.out.println("Output Array :"+Arrays.toString(nums));
        return count;
    }
}

