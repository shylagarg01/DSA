class Solution {
    public String simplifyPath(String path) {

        //    . ---> ignore 
        //     .. ---> stack ke top ko remove kro

        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");
        for(String p : parts){
            if(p.equals("") || p.equals(".")){
                continue;
            }
            if(p.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
                
            }
            else{
                st.push(p);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String f:st){
            sb.append("/");
            sb.append(f);
        }
        if(sb.length() == 0){
            return "/";
        }

        return sb.toString();
    }
}
