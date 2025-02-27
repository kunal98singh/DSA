package SolutionDSA;

public class Sort_an_Array {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int[] mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
            }
        return nums;
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= end) {
            temp[k++] = nums[j++];
        }
        for (i = start; i <= end; i++) {
            nums[i] = temp[i - start];
            }
            
            
        
    }
}
