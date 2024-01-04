/*
Our primary goal is to efficiently eliminate three numbers in a single operation.
However, when faced with a scenario where only one number remains, we can optimize the process by pairing it with the preceding triplet.
This allows us to divide the numbers into two sets of two, requiring only one additional operation.
For instance, if the numbers are initially arranged as follows: 111 | 111 | 111 | 1, we can transform them into: 111 | 111 | 11 | 11.
*/
class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int t:nums){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int ans=0;
        for(int x:map.values()){
            if(x<=1)return -1;
            int threes=x/3;
            ans+=threes;
            if(x%3!=0)ans++;
        }
        return ans;
    }
}
