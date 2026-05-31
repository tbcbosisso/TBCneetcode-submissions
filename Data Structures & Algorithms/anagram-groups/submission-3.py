class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs) == 0: 
            return []
        if len(strs) == 1: 
            return [[strs[0]]]
            
        anagramList = []
        visited = [False] * len(strs) # Track visited positions by index
        
        for i in range(len(strs)):
            if not visited[i]:
                myList = []
                myList.append(strs[i])
                visited[i] = True
                
                string = strs[i]
                
                for k in range(i + 1, len(strs)):
                    if not visited[k]:
                        t = strs[k]
                        
                        if len(t) == len(string):
                            t_ascii = [ord(char) for char in t]
                            string_ascii = [ord(char) for char in string]
                            
                            t_ascii.sort()
                            string_ascii.sort()
                            
                            if string_ascii == t_ascii:
                                myList.append(t)
                                visited[k] = True # Mark index as visited
                                
                anagramList.append(myList)
                
        return anagramList
                