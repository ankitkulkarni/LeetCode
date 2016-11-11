public class Solution {
    public String simplifyPath(String path) {
        LinkedList<String> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder("/");
        for(String str : path.split("/")){
            if(str.equals("..") && !stack.isEmpty()){
                stack.removeLast();
            }
            else if(!str.equals("") && !str.equals(".") && !str.equals("..")){
                stack.add(str);
            }
        }
        for(String str: stack){
            sb.append(str + "/");
        }
        if(!stack.isEmpty()){
            sb.setLength(sb.length()-1);
        }
        return sb.toString();
    }
}