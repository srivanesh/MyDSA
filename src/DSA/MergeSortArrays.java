package DSA;

import java.util.Arrays;

public class MergeSortArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        System.out.println("Input nums1= {1,2,3}");
        System.out.println("Input nums2= {2,5,6}");
        int i = m-1; // Length-1, so start from last element
        System.out.println("Value of i ="+i);
        int j = n-1; // Length-1, so start from last element
        System.out.println("Value of j ="+j);
        int k = ((m+n)-1); // Total all the elements and subtract one, so start from last element;
        System.out.println("Value of k ="+k);

        while(j >= 0){
            // Repeat J array is looped through and reach first element
            if( i >=0 && nums1[i] > nums2[j]){
                // Repeat till i is 0 and data in first array (i) is greater than second (j)
                // assign that i value to kth value
                nums1[k] = nums1[i];
                i --;
                k --;
                System.out.println("block 1 compare = nums1[i] "+nums1[i] +" :: nums2[j] = "+nums2[j] +" :: nums1[k] ="+ nums1[k]);
                System.out.println("block 1 value i= "+i +" :: j = "+j+ " :: K="+k);
            }else{
                nums1[k] = nums2[j];
                System.out.println("block 2 compare =  :: nums2[j] = "+nums2[j] +" :: nums1[k] ="+ nums1[k]);
                System.out.println("block 2 value  :: j = "+j+ " :: K="+k);
                j --;
                k --;

            }
        }

        System.out.println("OUTPUT ="+ Arrays.toString(nums1));
    }


}
