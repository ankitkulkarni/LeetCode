public class Solution {
    public int[] findPermutation(String s) {
        int[] arr = new int[s.length() + 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        for(int i = 0, j = 0; i < s.length() && j < arr.length; i++, j++){
            if(s.charAt(i) == 'D'){
                int count = 0;
                while(i < s.length() && s.charAt(i) == 'D'){
                    count++;
                    i++;
                }
                swap(arr, j, count + j);
                j += count - 1;
                i--;
            }
        }
        return arr;
    }
    public void swap(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
}