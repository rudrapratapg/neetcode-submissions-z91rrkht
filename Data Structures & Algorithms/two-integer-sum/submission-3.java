class Solution {
    public int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		Map<Integer, Integer> indexMap = new HashMap<>(n);
        for(int i=0;i<n;i++) {
			int diff = target - nums[i];
			if(indexMap.containsKey(diff)){
				return new int[]{indexMap.get(diff) , i};
			} else {
				indexMap.put(nums[i], i);
			}
		}
		return new int[0];
    }
}
