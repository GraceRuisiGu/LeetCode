class Solution:
    def isPalindrome(self, x: int) -> bool:
        origin = x
        reverse = 0
        if x<0 :
            return False
        if x==0:
            reverse=0
        while x!=0:
            tail = x%10
            x //= 10
            reverse = reverse*10 + tail
        print(reverse)
        return origin == reverse
