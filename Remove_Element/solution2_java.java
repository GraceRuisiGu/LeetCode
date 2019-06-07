class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        
        int i = 0;
        int j = nums.length;
        System.out.print(j);
        while(i<j){
            if(nums[i]==val){
                nums[i]=nums[j-1];
                j--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}