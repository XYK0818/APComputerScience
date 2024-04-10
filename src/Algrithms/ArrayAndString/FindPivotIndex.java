package Algrithms.ArrayAndString;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        // Initialize total sum of the given array...
        int totalSum = 0;
        // Initialize 'leftSum' as sum of first i numbers, not including nums[i]...
        int leftSum = 0;
        // Traverse the elements and add them to store the totalSum...
        for (int ele : nums)
            totalSum += ele;
        // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
        for (int i = 0; i < nums.length; leftSum += nums[i++])
            // sum to the left == leftSum.
            // sum to the right === totalSum - leftSum - nums[i]..
            // check if leftSum == totalSum - leftSum - nums[i]...
            if (leftSum * 2 == totalSum - nums[i])
                return i;       // Return the pivot index...
        return -1;      // If there is no index that satisfies the conditions in the problem statement...
    }

    public static void main(String[] args) {
        int[] nums1 = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums1));

        int[] nums2 = {1,2,3};
        System.out.println(pivotIndex(nums2));

        int[] nums3 = {2,1,-1};
        System.out.println(pivotIndex(nums3));

    }
}
