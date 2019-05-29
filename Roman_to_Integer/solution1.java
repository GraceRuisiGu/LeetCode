class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int sum = 0;
        int prevalue = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i = s.length()-1; i>=0; i--){
            char key = s.charAt(i);
            //System.out.println(key);
            int value = map.get(key);
            if(value >= prevalue){
                sum += value;
            }
            else{
                sum -= value;
            }
            prevalue = value;
        }
        return sum;
    }
}