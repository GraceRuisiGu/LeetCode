/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author guruisi
 */
class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int origin = x;
        if (x<0){
            return false;
        }
        if (x == 0){
            reverse = 0;
        }
        while(x!=0){
            int tail = x % 10;
            x /= 10;
            reverse = reverse * 10 + tail;
        }
        System.out.print(reverse);
        System.out.print(origin);
        return (origin == reverse);
    }
}

public class LeetCode {

    /**
     * @param args the command line arguments
     */
    
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            boolean ret = new Solution().isPalindrome(x);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
    
}
