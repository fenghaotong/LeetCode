package twosum;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        for(int i: twoSum2(nums, target)) {
            System.out.println(i);
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 2 && nums[0] + nums[1] != target) return result;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 2 && nums[0] + nums[1] != target) return result;
        Map<Integer, Integer> hashTable = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(hashTable.containsKey(target - nums[i])){
                result[0] = hashTable.get(target - nums[i]);
                result[1] = i;
            }
            hashTable.put(nums[i], i);
        }
        return result;
    }
}
