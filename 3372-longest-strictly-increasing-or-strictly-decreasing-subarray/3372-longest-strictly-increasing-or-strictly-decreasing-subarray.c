int longestMonotonicSubarray(int* nums, int numsSize) {

    int max = 0,des=1,incre = 1;
    if(numsSize == 1) return 1;
     for(int i = 0 ; i < numsSize - 1 ; i++)
     {
            if(nums[i] > nums[i+1])
            {
                incre = 1;
                des++;
            }
            else if(nums[i] < nums[i+1])
            {
                des = 1;
                incre++;
            }
            else
            {
                incre = 1;
                des = 1;
            }
            int temp = incre > des ? incre : des ;
             max = max < temp ? temp : max;
     }
       
     return max;
    
}