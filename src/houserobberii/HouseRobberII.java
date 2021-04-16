package houserobberii;

public class HouseRobberII {
    public static void main(String[] args) {
        int[] a = {1,2,5,3,10,1};
        HouseRobberII houseRobberII = new HouseRobberII();
        System.out.println(houseRobberII.rob(a));
    }
    public int rob(int[] nums) {
        int length = nums.length;
        if(length == 1) {
            return nums[0];
        } else if(length == 0) {
            return 0;
        } else if(length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        // 两种情况，第一偷前n-1个房屋中不相邻的房子，第二偷后n-1个房屋中不相邻的房子，取最大值
        return Math.max(robValue(nums, 0, length - 2), robValue(nums, 1, length - 1));
    }

    public int robValue(int[] nums, int start, int end){
        int first = nums[start], second = Math.max(nums[start], nums[start+1]);
        for (int i = start + 2; i <= end; i ++) {
            int tmp = second;
            second = Math.max(first + nums[i], second);
            first = tmp;
        }
        return second;
    }
}
