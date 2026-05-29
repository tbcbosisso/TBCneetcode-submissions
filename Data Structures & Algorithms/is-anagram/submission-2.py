class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #base
        if len(s)!= len(t):
            return False
        # Convert s and t into ascii lists
        s_ascii, t_ascii = [], []
        for i in range(len(s)):
            s_ascii.append(ord(s[i]))
            t_ascii.append(ord(t[i]))
        # Sort ascii lists
        s_ascii.sort()
        t_ascii.sort()
        # check list equality
        if (s_ascii == t_ascii):
            return True
        return False