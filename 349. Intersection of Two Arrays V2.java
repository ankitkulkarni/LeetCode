public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> totalSet = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            if(!totalSet.contains(nums1[i])){
                totalSet.add(nums1[i]);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(totalSet.contains(nums2[i])){
                intersectionSet.add(nums2[i]);
            }
        }
        int[] nums3 = new int[intersectionSet.size()];
        int count = 0;
        for(int num : intersectionSet){
            nums3[count++] = num;
        }
        return nums3;
    }
}