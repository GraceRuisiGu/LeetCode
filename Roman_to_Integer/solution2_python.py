class Solution:
    def romanToInt(self, s: str) -> int:
        mymap = {}
        mymap = {"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        myresult = 0
        prevalue = 0
        i = len(s)-1
        while i>=0:
            value = mymap.get(s[i])
            i=i-1
            if value>=prevalue:
                myresult += value
            else:
                myresult -= value
            prevalue = value
        return myresult
