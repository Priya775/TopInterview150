public class MoveZeros {
        public void moveZeroes(int[] nums) {
        int arrsize = nums.length;
        int nonzero = 0;
        for(int i=0;i< arrsize;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[nonzero];
                nums[nonzero] = temp;
                nonzero++;
            }
        }
    }
}