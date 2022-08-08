import java.util.Scanner;

public class mtxm 
{
    public static void main(String[] args) {

        int row1,col1,row2,col2;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Row for "+1+" Matrix : ");
        row1=s.nextInt();
        System.out.print("Enter Col for "+1+" Matrix : ");
        col1=s.nextInt();
        int mt1[][]=new int[row1][col1];
        System.out.print("Enter Row for "+2+" Matrix : ");
        row2=s.nextInt();
        System.out.print("Enter Col for "+2+" Matrix : ");
        col2=s.nextInt();
        int mt2[][]=new int[row2][col2];

        int[][] result=new int[row1][col2];
        System.out.println("First metrix is running");
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1[0].length; j++) {
                mt1[i][j] = s.nextInt();
            }
        }

        System.out.println("Second metrix is running");
        for (int i = 0; i < mt2.length; i++) {
            for (int j = 0; j < mt2[0].length; j++) {
                mt2[i][j] = s.nextInt();
            }
        }
        s.close();

        //Matrix Multiplication  Perfomr here
        for (int i = 0; i < result.length; i++) {
            for (int j= 0; j < result[0].length; j++) {
                result[i][j] = 0;
                for (int k= 0; k < row2; k++) {
                    result[i][j] += mt1[i][k] * mt2[k][j];
                }
            }
        }

        System.out.println("Multiplication : ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }System.out.println();
        }
    }    
}