package SolutionDSA;

public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for(int i = 1; i<n; i++){
           res[i] = nums[i-1] * res[i-1];
        }
        int temp1 = 1;

        for(int i = n-1; i>=0 ; i--){
            res[i] = res[i] * temp1;
            temp1 = temp1*nums[i];

        }

        //System.out.println(Arrays.toString(res));

        return res;
    }

}
