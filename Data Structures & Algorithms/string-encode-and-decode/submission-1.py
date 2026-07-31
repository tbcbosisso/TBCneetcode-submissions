class Solution:

    def encode(self, strs: List[str]) -> str:
        if not strs:
            return ""
        
        encoded_string = []
        for s in strs:
            # Append length + delimiter + original string
            encoded_string.append(f"{len(s)}#{s}")
            
        return "".join(encoded_string)

    # Decodes a single string to a list of strings.
    def decode(self, s: str) -> List[str]:
        decoded_list = []
        if not s:
            return decoded_list
            
        i = 0
        while i < len(s):
            # Find the delimiter position
            delimiter_idx = s.find('#', i)
            
            # Extract the length of the upcoming string
            length = int(s[i:delimiter_idx])
            # Move pointer right past the delimiter
            i = delimiter_idx + 1
            
            # Extract the actual string using the known length
            original_str = s[i : i + length]
            decoded_list.append(original_str)
            
            # Move pointer past the extracted string
            i += length
            
        return decoded_list