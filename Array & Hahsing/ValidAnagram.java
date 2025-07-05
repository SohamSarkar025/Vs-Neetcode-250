class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map =new HashMap<>();
        //Creating Increasing Frequency Map For String S
        for(char ch:s.toCharArray()){
            //map.put() function uses to put the frequency in the map .
            //map.getOrDefault is Uses to get the value or frequency,
            //if no value or frquency then assign it 0 .
            //+1 is used to increase the frequency.
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //Creating Decreasing Frequency Map For String t
        for(char ch : t.toCharArray()){
            //If one value comes that is not in string s, means not in the frequency map
            if(!map.containsKey(ch)){
                return false;
            }
            //Decreasing Frequency
            map.put(ch,map.get(ch)-1);
            //If Frequncy goes to down 0,means t conatins one element whose
            //frequency in t more than s.
            if(map.get(ch)<0){
                return false;
            }
        }
        return true;
    }
}

