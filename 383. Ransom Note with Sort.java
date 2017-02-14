public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        char[] c = ransomNote.toCharArray();
        char[] d = magazine.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        int i, j;
        for(i = 0, j = 0; i < c.length && j < d.length; i++, j++){
            if(c[i] != d[j]){
                while(j < d.length && c[i] != d[j]){
                    j++;
                }
                if(j >= d.length){
                    return false;
                }
            }
        }
        return i >= c.length ? true : false;
    }
}




public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        char[] c = ransomNote.toCharArray();
        char[] d = magazine.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        int i, j;
        for(i = 0, j = 0; i < c.length && j < d.length; i++, j++){
            if(c[i] == d[j]){
                continue;
            }
            else{
                while(j < d.length && c[i] != d[j]){
                    j++;
                }
                if(j < d.length && c[i] == d[j]){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return i >= c.length ? true : false;
    }
}