public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0){
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        if(n == 0){
            return;
        }
        int p1 = m - 1, p2 = n - 1;
        for(int i = m + n - 1; i >= 0; i--){
            if(p1 >= 0 && p2 < 0){
                return;
            }
            if(p2 >= 0 && p1 < 0){
                for(int j = 0; j <= p2; j++){
                    nums1[j] = nums2[j];
                }
                return;
            }
            if(p1 >= 0 && p2 >= 0){
                if(nums1[p1] > nums2[p2]){
                    nums1[i] = nums1[p1--];
                }
                else{
                    nums1[i] = nums2[p2--];
                }
            }
        }
    }
}