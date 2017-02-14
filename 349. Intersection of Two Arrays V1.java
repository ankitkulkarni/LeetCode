public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            while(i < nums1.length && j < nums2.length && nums1[i] < nums2[j]){
                i++;
            }
            while(i < nums1.length && j < nums2.length && nums2[j] < nums1[i]){
                j++;
            }
            if(i < nums1.length && j < nums2.length && nums1[i] == nums2[j]){
                set.add(nums1[i++]);
                j++;
            }
        }
        int[] nums3 = new int[set.size()];
        int count = 0;
        for(int num : set){
            nums3[count++] = num;
        }
        return nums3;
    }
}