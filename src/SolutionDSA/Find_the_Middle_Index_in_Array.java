package SolutionDSA;

public class Find_the_Middle_Index_in_Array {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            if (leftSum == (sum - leftSum - nums[i])) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;

    }

}
