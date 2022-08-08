import java.util.Scanner;

/* Write a program to check whether a number is prime or not. */
public class PrimeCheack 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        long number=s.nextLong();
        s.close();
        boolean isPrime=false;
        for(int i=2;i<=(number/2);i++)
        {
            if(number%i==0)
            {
                isPrime=true;
                break;
            }
        }
        System.out.println(isPrime?"Given number is not prime":"prime");
    }
}