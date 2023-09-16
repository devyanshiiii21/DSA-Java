package Hashing;

import java.util.HashMap;

public class Hashing {
    public static int[] countFrequency(int n, int x, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        int[] freq = new int[x];
        for (int key : map.keySet()) {
            freq[key] = map.get(key);
        }
        
        return freq;
    }
    
    public static void main(String[] args) {
        int n = 10;
        int x = 3;
        int[] nums = {11, 14, 8, 3, 12, 14, 1, 7, 4, 3};
        int[] result = countFrequency(n, x, nums);

        // Print the result array if needed
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}

