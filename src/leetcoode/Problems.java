package leetcoode;

import java.util.HashMap;

public class Problems {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{
                        map.get(complement), i
                };

            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("");
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = map.get(currentChar);

            if (currentValue > prevValue) {
                total += currentValue;
            } else {
                total -= currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String misStr = strs[0];
        for (String str : strs) {
            if (str.length() < strs.length) {
                misStr = str;
            }
        }

        for (int i = 0; i < misStr.length(); i++) {
            char c = misStr.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return misStr.substring(0, i);
                }
            }

        }
        return misStr;
    }

    public static void main(String[] args) {

    }
}
