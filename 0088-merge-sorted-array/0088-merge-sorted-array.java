class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = m ; i< m+n;i++)  nums1[i] = nums2[i-m];
        for(int i = 0 ; i < m+n-1;i++)
        {
            for(int j = i+1; j < m+n ; j++)
            {
                if(nums1[i] > nums1[j])
                {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        
        
    }
}