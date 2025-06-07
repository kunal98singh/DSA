package SolutionDSA;
// Replace elements with the greatest element on their right side
// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class replcae_element {
   public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for(int i = n-1; i>=0  ; i--){
            int current = arr[i];
            arr[i] = max;
            if(current> max ){
                max  =current;
            }
        }

        return arr;
    }

}
