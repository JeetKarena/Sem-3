import java.util.Scanner;

/* Read two 2x2 matrices and perform addition of matrices into third matrix and print it. */
class Matrix
{
    int[][] matrix1=new int[3][3];
    int[][] matrix2=new int[3][3];
    int[][] matrix3=new int[3][3];
    public Matrix()
    {
        Scanner s=new Scanner(System.in);
        //geting firsr matrix value from user
        System.out.println("Matrix 1 is runing");
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1.length;j++)
            {

                System.out.print("Enter Eliment No "+(i+1)+" "+(j+1)+" :");
                matrix1[i][j]=s.nextInt();
            }System.out.println();
        }

        //geting second matrix value from user
        System.out.println("Matrix 2 is runing");
        for(int i=0;i<matrix2.length;i++)
        {
            for(int j=0;j<matrix2.length;j++)
            {

                System.out.print("Enter Eliment No "+(i+1)+" "+(j+1)+" :");
                matrix2[i][j]=s.nextInt();
            }System.out.println();
        }
        s.close();

        //sum is performed here 
        System.out.println("Matrix 3 is runing");
        for(int i=0;i<matrix3.length;i++)
        {
            for(int j=0;j<matrix3.length;j++)
            {
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            }

        }
        //displaying 3rd matrix
        for(int i=0;i<matrix3.length;i++)
        {
            for(int j=0;j<matrix3.length;j++)
            {
                System.out.print(matrix3[i][j]+" ");
            }System.out.println();

        }
    }



}
public class MatrixSum 
{
    public static void main(String[] args) 
    {
        // System.out.println("it's working"); 
        Matrix a=new Matrix();   
    }
}