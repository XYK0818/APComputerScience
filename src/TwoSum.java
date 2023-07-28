import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
//    Example 1:
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//    Example 2:
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]

//    Example 3:
//    Input: nums = [3,3], target = 6
//    Output: [0,1]

    public static void main(String[] args){
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
//        int[] nums = new int[] {3, 2, 4};
//        int target = 6;
//        int[] nums = new int[] {3, 3};
//        int target = 6;

        int[] result1 = twoSumBruteForce(nums, target);
        int[] result2 = twoSumHashMap(nums, target);

        for(int res: result1){
            System.out.println(res);
        }

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));

    }


    public static int[] twoSumBruteForce(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }


    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

}
