class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> n = new ArrayList<Integer>();

         for(int i : nums)
            {
              n.add(i);
            }  

            for(int i = 0 ; i < n.size() ; i++)
            {
                int temp = n.get(i);
                n.remove(n.get(i));
                int index = n.indexOf(temp);
                if(index == -1) return temp;
            }  

            return -1;      
        
    }
}