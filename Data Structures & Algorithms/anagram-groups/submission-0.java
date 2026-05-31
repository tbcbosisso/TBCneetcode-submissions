class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
        // 1. If length is 0, returns an empty list: []
        if (strs.length == 0) return List.of();

        // 2. If length is 1, returns a nested list: [[strs[0]]]
        if (strs.length == 1) return List.of(List.of(strs[0]));
        
        // With 2 or more strings
        //The nanagram list
        List<String> anagramList = new ArrayList<>();
        //sublists
        for (int i=0; i<strs.length;i++){
            for (int k=i+1; k<strs.length;k++){
                List<String> myList = new ArrayList<>();
                myList.add(strs[i]);
                String[] s = strs[i];
                String[] t = strs[k];
                //String size check
                if(s_ascii.length() == t_ascii.length()){ //while
                    int[] s_ascii = new int[s.length];
                    int[] t_ascii = new int[t.length];

                    for(int j=0;j<s.length;j++){
                        s_ascii[j] = s.charAt(j);
                        t_ascii[j] = t.charAt(j);
                    }
                    Arrays.sort(s_ascii);
                    Arrays.sort(t_ascii);
                    if (Arrays.equals(s_ascii, t_ascii)){
                        myList.add(t);
                    }
                }
            }
            anagramList.add(myList);
        }
    return anagramList;     
    }**/
    // 1. If length is 0, returns an empty list: [] 
        if (strs.length == 0) return new ArrayList<>(); // Changed to mutable ArrayList to avoid type errors

        // 2. If length is 1, returns a nested list: [[strs[0]]] 
        if (strs.length == 1) return new ArrayList<>(List.of(new ArrayList<>(List.of(strs[0])))); 

        // FIX 1:Must be a List of Lists to match the return type
        List<List<String>> anagramList = new ArrayList<>(); 
        
        // Track which strings have already been grouped so we don't reuse them
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) { 
            // FIX 4: Skip this string if it was already grouped in a previous anagram list
            if (visited[i]) continue; 

            List<String> myList = new ArrayList<>(); 
            myList.add(strs[i]); 
            visited[i] = true;

            // FIX 2: Use 'String', not 'String[]'
            String s = strs[i]; 

            for (int k = i + 1; k < strs.length; k++) { 
                if (visited[k]) continue;

                String t = strs[k]; 

                // FIX 3: Check lengths using s and t, since s_ascii isn't made yet
                if (s.length() == t.length()) { 
                    int[] s_ascii = new int[s.length()]; 
                    int[] t_ascii = new int[t.length()]; 

                    for (int j = 0; j < s.length(); j++) { 
                        s_ascii[j] = s.charAt(j); 
                        t_ascii[j] = t.charAt(j); 
                    } 

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
