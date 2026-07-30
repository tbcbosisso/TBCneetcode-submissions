class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }
        
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            // Append length + delimiter + original string
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return decodedList;
        }
        int i = 0;
        while (i < str.length()) {
            // Find the delimiter position
            int delimiterIdx = str.indexOf('#', i);
            
            // Extract the length of the upcoming string
            int length = Integer.parseInt(str.substring(i, delimiterIdx));
            
            // Move pointer right past the delimiter
            i = delimiterIdx + 1;
            
            // Extract the actual string using the known length
            String originalStr = str.substring(i, i + length);
            decodedList.add(originalStr);
            
            // Move pointer past the extracted string
            i += length;
        }
        return decodedList;
    }
}
