package SolutionDSA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                int prev = stack.pop();
                nextGreaterMap.put(prev, num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGreaterMap.getOrDefault(nums1[i], -1);

        }
        return res;

    }

}
