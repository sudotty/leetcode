package day1;

public class TwoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (target - numbers[i] == numbers[j]) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        throw new RuntimeException("cannot find the answer");
    }

    public int[] twoSum2(int[] numbers, int target) {
        for (int i = 0, j = numbers.length - 1; i < j; ) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }
}
