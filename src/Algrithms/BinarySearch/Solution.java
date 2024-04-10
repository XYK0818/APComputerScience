package Algrithms.BinarySearch;

public class Solution {
    public static int search(int[] nums, int target) {
        // Set the left and right boundaries
        int left = 0, right = nums.length - 1;
        // Under this condition
        while (left <= right) {
            // Get the middle index and the middle value.
            int mid = left + (right - left) / 2;
            // Case 1, return the middle index.
            if (nums[mid] == target) {
                return mid;
            }
            // Case 2, discard the smaller half.
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // Case 3, discard the larger half.
            else {
                right = mid - 1;
            }
        }
        // If we finish the search without finding target, return -1.
        return -1;
    }

    public static int mySqrt(int x) {
        // For special cases when x is 0 or 1, return x.
        if (x == 0 || x == 1)
            return x;

        // Initialize the search range for the square root.
        int start = 1;
        int end = x;
        int mid = -1;

        // Perform binary search to find the square root of x.
        while (start <= end) {
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
            mid = start + (end - start) / 2;

            // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        }

        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct square root.
        return Math.round(end);
    }

    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;

        while(start <= end){
            long mid = start + (end-start)/2;
            long squareMid = mid*mid;

            if(squareMid == num){
                return true;
            }else if(squareMid > num){
                end = (int) mid-1;
            }else {
                start = (int) mid+1;
            }
        }
        return false;
    }

    public static int findMin(int[] nums) {
        int res = nums[0]; // Setting any random value
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            // If the array is already sorted
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = (l + r) / 2;
            res = Math.min(res, nums[m]);
            if (nums[m] >= nums[l]){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums, target));

        System.out.println(mySqrt(8));

        System.out.println(findMin(nums));

        System.out.println((isPerfectSquare(16)));

    }

}
