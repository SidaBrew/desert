package com.sidabw;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

    @Test
    public void sum() {
        int nums[] = new int[]{3, 2, 4};
        int target = 6;
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (map.containsKey(target - nums[i])) {
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);

                }

            }

        }
    }
}