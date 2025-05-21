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

                    k = 0;
                    while(k < matrix[0].length)
                    {
                        if(matrix[i][k] != 0) matrix[i][k] = -99875534;
                        k++;
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