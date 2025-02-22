class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(arr.indexOf(nums[i]) != -1) return true;
            arr.add(nums[i]);
        }
        return false;

        
    }
}