package DSA;

public class MajorityElement {

    public static void main(String[] args) {
        //int[] nums = {2,2,1,1,1,2,2};
        int[] nums = {3,1,1,1,1,1,1,1,3};
        int maxElement = majorityElement(nums);
        System.out.println("maxElement :"+maxElement);
    }

    public static int majorityElement(int[] nums) {
        int number = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            System.out.println("Begin Value of count :"+count);
            System.out.println("Begin Value of number :"+number);
            System.out.println("Begin Value of nums[i] :"+nums[i]);
            if(count == 0 && number != nums[i]){ // First time iteration
                System.out.println("If Condition met nums[i] :"+nums[i]);
                number = nums[i]; // get the first element in array and assign that to number
                count = 1; // increment count to 1
            }
            else
                count = (number == nums[i]) ? count+1 : count-1;
            /*
            Key Insight:

The algorithm relies on the fact that if there exists a majority element in the array, it will survive the count manipulation because it occurs more than n/2 times,
 where n is the length of the array.
The count is incremented when the current element matches the potential majority element and decremented when it doesn’t.
If the count reaches zero, it means the potential majority element encountered an equal number of opposing elements, so it’s reset with the current element.
             */
        }

        return number;
    }

}
