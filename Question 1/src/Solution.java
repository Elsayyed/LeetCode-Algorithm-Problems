class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] tempIndices = new int[2];

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (target == nums[i]+nums[j]){
                    tempIndices[0] = i;
                    tempIndices[1] = j;
                    //return new int[] {i,j};
                }
            }
        }
        return tempIndices;
        //or throw new IllegalArgumentException("No two sum solution");
    }
}