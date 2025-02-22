int maxAscendingSum(int* nums, int numsSize) {

    int max =0,sum = 0;
    if(numsSize == 1) return nums[0];
    for(int i = 0 ; i < numsSize - 1 ; i++)
    {
        if(nums[i] < nums[i+1])
        {
            if(sum == 0) sum = nums[i];
            sum += nums[i+1];
        }
        else
        {
            sum = 0;
        }
         max = max < sum ? sum : max;
         max = max < nums[i] ? nums[i] : max;
    }
    return max;
    
}