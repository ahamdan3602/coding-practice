class ParityOfArray {
    public boolean isArraySpecial(int[] nums) {

        int n = nums.length;
        if (n == 1)  {
            return true;
        }
        int i = 0;
        int j = 1;

        while (j < n && i < n) {
            if (nums[i] % 2 == 0 && nums[j] % 2 != 0 || nums[i] % 2 != 0 && nums[j] % 2 == 0 ) {
                i++;
                j++;
            } else {
                return false;
            }
        }

        return true;


        
    }
}
