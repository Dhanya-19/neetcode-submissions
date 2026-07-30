class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            encoded_string.append(strs.get(i).length()+"'"+strs.get(i));
        }
        return encoded_string.toString();
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
            StringBuilder word= new StringBuilder();
            for(int j=0;j<num;j++){
                word.append(str.charAt(i));
                i++;
            }
            decoded_strs.add(word.toString());
        }
        return decoded_strs;
    }
}
