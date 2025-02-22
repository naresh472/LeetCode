bool isArraySpecial(int* nums, int numsSize) {

    if(numsSize == 1) return true;
    else 
    {
        
        for(int i = 0 ; i < numsSize -1  ; i++)
        {
            bool ans = nums[i] % 2;
            bool ans2 =nums[i+1] % 2;
           if( ans  ==  ans2  )
           {
            return false;
           }
        }
    }

    return true;
    
}