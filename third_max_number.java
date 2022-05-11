class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!arr.contains(nums[i]))
                arr.add(nums[i]);
            
        }
        Collections.sort(arr);
        
        if(arr.size()<3)
        {
            return arr.get(arr.size()-1);
        }
        return arr.get(arr.size()-3);
    }
}
