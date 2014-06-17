public class classTest{
    public static int[][] RotateMatrixByNintyDegree(int[][] matrix, int n){
            int[][] newMatrix = new int[n][n];
            //copy the rows to column
            for(int r=0; r<n;r++){
                for(int c=0;c<n;c++){
                    newMatrix[c][n-r-1]=matrix[r][c];
                }
            }
            return newMatrix;
    }

     public static void main(String []args){
         
        int[][] matrix ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
    int[][] result =RotateMatrixByNintyDegree(matrix,4);
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++)
            System.out.print(result[i][j] +" ");
        System.out.println();    
        }
    
    }
}    