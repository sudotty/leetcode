package day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public int[] twoSum2(int[] nums, int target) {
        int[] indexs = new int[2];

        // 建立k-v ，一一对应的哈希表
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hashMap.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hashMap.put(target - nums[i], i);
        }
        return indexs;
    }

    public int[] twoSum3(int[] nums, int target) {
        int[] indexs = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hashMap.get(nums[i]);
                return indexs;
            }
            hashMap.put(target - nums[i], i);
        }
        return indexs;
    }
}
