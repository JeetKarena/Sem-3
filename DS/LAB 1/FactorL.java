import java.util.Scanner;

/* Write a program to find factorial of a number. (Using Loop) */
public class FactorL
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        long Number=s.nextLong();
        long factorial=1;
        s.close();
        for(long i=1;i<=Number;i++)
        {
            factorial*=i;
        }  
        System.out.println("Factorial Is  : "+factorial);  
    }
} 