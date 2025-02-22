bool check(int* nums, int numsSize) {

    int last = 0,code = 0;
    for (int i = 0 ; i < numsSize-1;i++)
    {
        if(nums[i] < nums[i+1])
        {
             if(code == 1)
            {
                if(last > nums[i] && last < nums[i+1]) return false;

            }
        }
        else if(nums[i] > nums[i+1])
        {
            if(code == 0) 
            {
                code = 1;
                last = nums[i];
                continue;
            }
            if(code == 1) return false;

           
        }
    }
   return true;
    
}