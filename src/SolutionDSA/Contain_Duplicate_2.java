package SolutionDSA;

import java.util.*;

public class Contain_Duplicate_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> lists = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            if (lists.containsKey(nums[i]) &&(i-lists.get(nums[i])<=k) ) {
                return true;
            }
            lists.put(nums[i], i);
        }
       return  false;

    }
    }

