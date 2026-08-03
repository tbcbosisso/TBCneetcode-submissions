class Solution {
    public boolean isPalindrome(String s) {
        // Convert to lowercase to handle case-insensitivity
        s = s.toLowerCase();
        String list_char = ""; 
        
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) { 
                list_char += ch; 
            } 
        } 
        
        String rev_String = new StringBuilder(list_char).reverse().toString();
        return rev_String.equals(list_char);
    }
    
}
