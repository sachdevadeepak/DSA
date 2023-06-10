class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int i=0, j=0, maxLength=0, count=0;
        while(j<s.length()-1){
            if(s.charAt(j)==s.charAt(j+1)){
                count++;
            }
            while(count>=2){
                maxLength=Math.max(maxLength,j-i+1);
                if(s.charAt(i)==s.charAt(i+1)){
                    count--;   
                } 
                i++;
            }
            j++;
        }
        return Math.max(maxLength,j-i+1);
    }
}