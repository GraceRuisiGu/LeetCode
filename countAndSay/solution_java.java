class Solution {
    public String countAndSay(int n) {
        String curr = "1";
        String prev;
        int count;
        for(int i=1; i<n; i++){
                prev = curr;
                curr = "";
                count = 1;
                char say = prev.charAt(0);
                for(int j=1; j<prev.length(); j++){
                    if(prev.charAt(j)==say)
                        count++;
                    else{
                        curr = curr + count + say;
                        count = 1;
                        say = prev.charAt(j);
                    }
                }
            curr = curr + count + say;
        }
        return curr;
    }
}