class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
		for(int num : nums) {
			boolean added = set.add(num);
			if(!added) {
				System.out.println("Duplicate found: " + num);
                return true;
			}
		}
        return false;
    }
}
