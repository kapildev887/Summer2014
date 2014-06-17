public class classTest{
    public static int[][] setMatrixMNtoZero(int[][] matrix, int m, int n){
        //check the oth row and column and save the value
        int rfirst=1;
        int cfirst=1;
        for(int c=0;c<n;c++){
            if(matrix[0][c]==0){
                cfirst=0;
                break;
            }
        }
        //Find for column
       for(int r=0;r<m;r++){
            if(matrix[r][0]==0){
                rfirst=0;
                break;
            }
        }
        
                for(int r=1; r<m; r++){
                    for(int c=1; c<n; c++){
                        if(matrix[r][c]==0){
                            matrix[r][0]=0;
                            matrix[0][c]=0;
                        }
                    }
                }
                //Now set the all rows and columns for that row to 0 except the [0][0]
                //set the matrix to 0 column wise
            
                    for(int c=1; c<n;c++){
                        if(matrix[0][c]==0){
                            for(int r=0;r<m;r++){
                                matrix[r][c]=0;
                            }
                        }
                    }
                //set the matrix to 0 row wise
                   for(int r=1; r<n;r++){
                        if(matrix[r][0]==0){
                            for(int c=0;c<m;c++){
                                matrix[r][c]=0;
                            }
                        }
                    }
                //check the 0th row and column 
                if(rfirst==0){
                    //set the 0th column and row to zero
                    for(int r=0;r<m;r++){
                        matrix[r][0]=0;
                    }
                }
                if(cfirst==0){
                     //set the 0th row to zero
                    for(int c=0;c<n;c++){
                        matrix[0][c]=0;
                    }
                }
        return matrix;        
    }

     public static void main(String []args){
         
        int[][] matrix ={
            { 1, 2, 3, 0},
            { 5, 6, 0, 8},
            { 9,10,11,12},
            {13,0,15,16}
        };
    int[][] result =setMatrixMNtoZero(matrix,4,4);
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++)
            System.out.print(result[i][j] +" ");
        System.out.println();    
        }
    
    }
}    

