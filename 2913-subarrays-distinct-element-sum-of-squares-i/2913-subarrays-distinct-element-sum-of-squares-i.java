class Solution {
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> map = new HashSet<>();
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                for(int k=i;k<=j;k++){
                    map.add(nums.get(k));
                }
                sum += map.size()*map.size();
            map.clear();
            }
            
        }
        return sum;
    }
}