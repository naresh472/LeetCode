class Solution {
    public int maxArea(int[] arr) {

        int max=0;
        int i = 0;

        int ptr=arr.length-1;


        while (ptr != i)
        {
             int value=Math.min(arr[i],arr[ptr]);
                int contain = (ptr-i)*value;
                max =Math.max(max,contain);

                if(value == arr[i]) i++;
                else ptr--;
        }


        return max;

        
    }
}