class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        // System.out.println(h);
        if(n == 0)
            return 0;
        if(n>h)
            return -1;
        for(int i = 0; i<=h-n; i++){
            for(int j = 0; j<n; j++){
                
                //nums[] can only use in array,
                //for string use charAt instead
                if(needle.charAt(j)!=haystack.charAt(i+j))
                    break;
                if (j == needle.length()-1)
                    return i;
            }
        }
        return -1;
    }
}