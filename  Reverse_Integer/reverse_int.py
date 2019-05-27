class Solution:
    def reverse(self, x: int) -> int:
        result = 0
        origin = x
        if x < 0:
            x = x *-1
        while x != 0:
            tail = x % 10
            x = x // 10
            result = result * 10 + tail
        if result > pow(2,31):
            return 0
        if result < -pow(2,31):
            return 0
        if origin >= 0:
            return result
        if origin < 0:
            return result*-1
