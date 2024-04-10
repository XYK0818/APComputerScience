package Algrithms.ArrayAndString;

public class NumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = -1;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                secMax = maxNum;
                maxNum = nums[i];
                maxIndex = i;
            } else if (nums[i] > secMax) {
                secMax = nums[i];
            }
        }

        if (maxNum >= 2 * secMax) {
            return maxIndex;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3,6,1,0};
        System.out.println(dominantIndex(nums1));

        int[] nums2 = {1,2,3,4};
        System.out.println(dominantIndex(nums2));
    }
}
