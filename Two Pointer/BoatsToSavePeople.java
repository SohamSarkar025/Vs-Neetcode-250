class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats=0;
        // Sort to apply two-pointer technique
        Arrays.sort(people); 
        int left=0,right=people.length-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}
