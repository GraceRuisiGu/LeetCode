Python 3.7.3 (v3.7.3:ef4ec6ed12, Mar 25 2019, 16:52:21) 
[Clang 6.0 (clang-600.0.57)] on darwin
Type "help", "copyright", "credits" or "license()" for more information.
>>> class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        count = 0
        for i in range (len(s)-1,-1,-1):
            if s[i] == ' ' and count != 0:
                break
            elif s[i] != ' ':
                count = count + 1
        return count
