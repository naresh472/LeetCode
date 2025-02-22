int longestMonotonicSubarray(int* nums, int numsSize) {

    int max = 0,des=1,incre = 1;

     for(int i = 0 ; i < numsSize - 1 ; i++)
     {
            if(nums[i] > nums[i+1])
            {
                if(incre > 1)
                {
                    max = max < incre ? incre : max;
                    incre = 1;
                }

                des++;
            }
            else if(nums[i] < nums[i+1])
            {
                if(des > 1)
                {
                   max = max < des ? des : max;
                    des = 1;  
                } 
                incre++;
            }
            else
            {
                int temp = incre > des ? incre : des ;
                max = max < temp ? temp : max;
                incre = 1;
                des = 1;
            }
     }
       int temp = incre > des ? incre : des ;
        max = max < temp ? temp : max;
     return max;
    
}