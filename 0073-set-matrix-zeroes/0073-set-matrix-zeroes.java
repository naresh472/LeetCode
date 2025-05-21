class Solution {
    public void setZeroes(int[][] matrix) {

        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[0].length ; j++)
            {
                if(matrix[i][j] == 0)
                {
                    int k = 0;
                    while(k < matrix.length)
                    {
                        if(matrix[k][j] != 0) matrix[k][j] = -99875534;
                        k++;

                    }

                     int m = 0;
                    while(m < matrix[0].length)
                    {
                        if(matrix[i][m] != 0) matrix[i][m] = -99875534;
                        m++;
                    }
                }
            }
        }

          for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[0].length ; j++)
            {
                if(matrix[i][j] == -99875534)
                {
                    matrix[i][j] = 0;  
                }
            }

        }
        
    }
}