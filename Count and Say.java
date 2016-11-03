public class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for(int i = 0; i < n-1; i++){
            str = appender(str);
        }
        return str;
    }
    public String appender(String str){
        int count = 1, i = 0;
        char c = str.charAt(i++);
        StringBuilder sb = new StringBuilder();
        while(i < str.length()){
            if(c == str.charAt(i)){
                count++;
                i++;
            }
            else{
                sb.append(count);
                sb.append(c);
                c = str.charAt(i++);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}