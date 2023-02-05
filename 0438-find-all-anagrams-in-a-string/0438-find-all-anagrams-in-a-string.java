class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] count = new int[26];
        List<Integer>anagrams = new LinkedList<>();
        if(p.length() > s.length()) {
            return anagrams;
        }
        for(int i=0;i<p.length();i++) {
            count[p.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }
        for(int i=p.length();i<s.length();i++) {
            if(present(count)) {
                anagrams.add(i-p.length());
            }
            count[s.charAt(i) - 'a']--;
            count[s.charAt(i-p.length()) - 'a']++;
        }
         if(present(count)) {
                anagrams.add(s.length()-p.length());
            }
        return anagrams;
    }
    boolean present(int[] count) {
        for(int i=0;i<26;i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}