class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // If length is 0, returns an empty list: [] 
        if (strs.length == 0) return new ArrayList<>(); 
        // If length is 1, returns a nested list: [[strs[0]]] 
        if (strs.length == 1) return new ArrayList<>(List.of(new ArrayList<>(List.of(strs[0])))); 
        // Create a List of Lists to match the return type
        List<List<String>> anagramList = new ArrayList<>(); 
        // Track which strings have already been grouped so we don't reuse them
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) { 
            // Skip this string if it was already grouped in a previous anagram list
            if (visited[i]) continue; 
            List<String> myList = new ArrayList<>(); 
            myList.add(strs[i]); 
            visited[i] = true;
            // Set a list s
            String s = strs[i]; 
            // Loop through the remaining strings in strs
            for (int k = i + 1; k < strs.length; k++) { 
                if (visited[k]) continue;
                // Create new list t
                String t = strs[k]; 
                // Check lengths 
                if (s.length() == t.length()) { 
                    int[] s_ascii = new int[s.length()]; 
                    int[] t_ascii = new int[t.length()]; 
                    // Create ascii lists of s and t
                    for (int j = 0; j < s.length(); j++) { 
                        s_ascii[j] = s.charAt(j); 
                        t_ascii[j] = t.charAt(j); 
                    } // Sort ascii lists
                    Arrays.sort(s_ascii); 
                    Arrays.sort(t_ascii); 

                    if (Arrays.equals(s_ascii, t_ascii)) { 
                        myList.add(t); 
                        visited[k] = true; // Mark as grouped
                    } 
                } 
            } 
            anagramList.add(myList); 
        } 
        return anagramList; 
    }
}
