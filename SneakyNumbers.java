class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sol = new int[2];

        for (int i = 0; i < nums.length;i++) { 
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.replace(nums[i], map.get(nums[i])+1);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() > 1){
                sol[i++] = pair.getKey().intValue();
            }

        }
        return sol;
        
    }
}
