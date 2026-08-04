class Solution:
    def isPalindrome(self, s: str) -> bool:
        listString = ""
        s=s.lower()
        for c in s:
            if (c>='a' and c<='z') or (c>='0' and c<='9'):
                listString += c
        rev_String=listString[::-1]
        return rev_String == listString
        