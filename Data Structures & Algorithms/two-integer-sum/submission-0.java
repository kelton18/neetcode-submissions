class Solution {
    public int[] twoSum(int[] nums, int target) {
        // [3, 4, 5, 6], target = 7

        // iterate through array
        // keep track of two indecies
        // conditional statement to make sure idx is different
        int[] solution = new int[2]; 

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }
}
