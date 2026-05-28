class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        // turn each character in s and t into its ACII number
        int[] s_ascii = s.chars().toArray();
        int[] t_ascii = t.chars().toArray();
        //make a list of those number s_ac and t_ac
        for(int i=0;i<s.length();i++){
            s_ascii[i] = s.charAt(i);
            t_ascii[i] = t.charAt(i);
        }
        //sort the new list s_ac and t_ac
        Arrays.sort(s_ascii);
        Arrays.sort(t_ascii);
        //if equal return true else return false
        if (Arrays.equals(s_ascii, t_ascii)){
            return true;
        }
        return false;
    }
}
