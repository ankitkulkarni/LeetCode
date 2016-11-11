public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, ++i);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



static String rearrangeWord(String word) {
    int i = word.length() - 2;
    char[] c = word.toCharArray();
    while(i >= 0 && word.charAt(i + 1) <= word.charAt(i)){
        i--;
    }
    if(i >= 0){
        int j = word.length() - 1;
        while(j >= 0 && word.charAt(j) <= word.charAt(i)){
            j--;
        }
        swap(c, i, j);
    }
    reverse(c, i+1);
    String str = new String(c);
    if(str.equals(word)){
        return new String("no answer");
    }
    return str;
}

static void reverse(char[] c, int start){
    int i = start, j = c.length - 1;
    while(i < j){
        swap(c, i++, j--);
    }
}

static void swap(char[] c, int i, int j){
    char temp = c[i];
    c[i] = c[j];
    c[j] = temp;
}