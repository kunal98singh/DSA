package SolutionDSA;

import java.util.*;

class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int i , j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        int[] res = new int[k];
        for (i = 0; i < k; i++) {
            res[j++] = list.get(i).getKey();
        }
        return res;
    }
}