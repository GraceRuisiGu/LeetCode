class Solution:
    def romanToInt(self, s: str) -> int:
        mymap = {}
        mymap = {"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        myresult = 0
        prevalue = 0
        str1=s[::-1]
        for i in range(0,len(str1)):
            key = str1[i]
            print(key)
            value = mymap.get(key)
            if value>=prevalue:
                myresult += value
            else:
                myresult -= value
            prevalue = value
        return myresult

def stringToString(input):
    import json

    return json.loads(input)

def main():
    import sys
    import io
    def readlines():
        for line in io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8'):
            yield line.strip('\n')

    lines = readlines()
    while True:
        try:
            line = next(lines)
            s = stringToString(line);
            
            ret = Solution().romanToInt(s)

            out = str(ret);
            print(out)
        except StopIteration:
            break

if __name__ == '__main__':
    main()
