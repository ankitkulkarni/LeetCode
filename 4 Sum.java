public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		if (nums == null || nums.length < 4){
			return res;
		}
		Arrays.sort(nums);
		if (4 * nums[0] > target || 4 * nums[nums.length - 1] < target){
			return res;
		}
		for (int i = 0; i < nums.length; i++) {
			int z = nums[i];
			if (i > 0 && z == nums[i - 1]){// avoid duplicate
				continue;
			}
			if (z + 3 * nums[nums.length - 1] < target){ // z is too small
				continue;
			}
			if (4 * z > target){ // z is too large
				break;
			}
			if (4 * z == target) { // z is the boundary
				if (i + 3 < nums.length && nums[i + 3] == z){
					res.add(Arrays.asList(z, z, z, z));
				}
				break;
			}
			threeSumForFourSum(nums, target - z, i + 1, nums.length - 1, res, z);
		}
		return res;
	}
	public void threeSumForFourSum(int[] nums, int target, int low, int high, ArrayList<List<Integer>> fourSumList,
			int z1) {
		if (low + 1 >= high){
			return;
		}
		int max = nums[high];
		if (3 * nums[low] > target || 3 * max < target){
			return;
		}
		for (int i = low; i < high - 1; i++) {
			int z = nums[i];
			if (i > low && z == nums[i - 1]){ // avoid duplicate
				continue;
			}
			if (z + 2 * max < target){ // z is too small
				continue;
			}
			if (3 * z > target){ // z is too large
				break;
			}
			if (3 * z == target) { // z is the boundary
				if (i + 1 < high && nums[i + 2] == z){
					fourSumList.add(Arrays.asList(z1, z, z, z));
				}
				break;
			}
			twoSumForFourSum(nums, target - z, i + 1, high, fourSumList, z1, z);
		}
	}
	public void twoSumForFourSum(int[] nums, int target, int low, int high, ArrayList<List<Integer>> fourSumList,
			int z1, int z2) {
		if (low >= high){
			return;
		}
		if (2 * nums[low] > target || 2 * nums[high] < target){
			return;
		}
		int i = low, j = high, sum, x;
		while (i < j) {
			sum = nums[i] + nums[j];
			if (sum == target) {
				fourSumList.add(Arrays.asList(z1, z2, nums[i], nums[j]));
				x = nums[i];
				while (i < j && x == nums[i]){
				    i++;
				} // avoid duplicate
				x = nums[j];
				while (i < j && x == nums[j]){
				    j--;
				} // avoid duplicate
			}
			if (sum < target){
				i++;
			}
			if (sum > target){
				j--;
			}
		}
		return;
	}
}