class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        for(int j=0;j<strs[0].length();j++){
            for(int i=0;i<strs.length;i++){
                if(j>=strs[i].length()){
                    return prefix;
                }
                if(strs[0].charAt(j)!=strs[i].charAt(j)){
                   return prefix;
                }
            }
            prefix+=strs[0].charAt(j);
        }
    return prefix;  
    }
}