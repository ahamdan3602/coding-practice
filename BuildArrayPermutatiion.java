class BuildArrayPermutation {
    public int[] buildArray(int[] nums) {
        int[] sol = new int[nums.length];
        for (int i = 0; i < nums.length;i++) {
            sol[i] = nums[nums[i]];
           /*
            i = 0, nums[i] = 0,
            i = 1, nums[i] = 2.
            i = 2, nums[i] = 1 

            nums[0] = 0
            nums[2] = 1
            nums[1] = 2
            */
         
        }
        return sol;
        
