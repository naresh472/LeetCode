class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
       int a = num1.length;
       int b =num2.length;
        int tot=a+b;
       int[] arr =new int[tot];

       System.arraycopy(num1,0,arr,0,a);
       System.arraycopy(num2,0,arr,a,b);
        Arrays.sort(arr);
        if((tot % 2) == 0)
        {
            int index1=tot/2;
            int index2=index1-1;
            double n1 = (double) arr[index1];
            double n2 = (double) arr[index2];

            double ans = (n1+n2)/2; 
                return ans;
        }
        else
        {
           int index = ((tot-1)/2);  
           return (double)arr[index];
        }

        


        
    }
}