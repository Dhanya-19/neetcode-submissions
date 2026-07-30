class Solution {

    public String encode(List<String> strs) {
        String encoded="";
        for(int i=0;i<strs.size();i++){
            encoded+=strs.get(i).length()+"'"+strs.get(i);
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            String length="";
            while(str.charAt(i)!='\''){
                length+=str.charAt(i);
                i++;
            }
            int num=Integer.parseInt(length);
            i++;
            String word="";
            for(int j=0;j<num;j++){
                word+=str.charAt(i);
                i++;
            }
            decoded_strs.add(word);
        }
        return decoded_strs;
    }
}
