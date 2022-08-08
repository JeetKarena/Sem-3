import java.util.Scanner;

/* Read two matrices, first 3x2 and second 2x3, perform multiplication operation and store result in third matrix and print it. (Home Work) */
public class MatrixMultiplication {
    public static void main(String args[]) {
        // creating two matrices
        int a[][] = new int[3][2], b[][] = new int[2][3], mult[][] = new int[3][3];
        int r, c, i, j, k;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of row=");
        r = s.nextInt();// scanf("%d",&r);
        System.out.print("enter the number of column=");
        c = s.nextInt();// scanf("%d",&c);
        System.out.print("enter the first matrix element=\n");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.print("enter the second matrix element=\n");
        r = 2;
        c = 3;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[i][j] = s.nextInt();
            }
        }

        System.out.print("multiply of the matrix=\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                mult[i][j] = 0;
                for (k = 0; k < 2; k++) {
                    mult[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        // for printing result
       // r = 3;
        //c = 3;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(" " + mult[i][j]);
            }
            System.out.print("\n");
        }
        // return 0;
    }

}