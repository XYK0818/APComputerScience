import Algrithms.BinarySearch.Solution;


public class BinarySearchTest {

    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(nums);
        System.out.println(target);

        System.out.println(Solution.search(nums, target));

    }


}
