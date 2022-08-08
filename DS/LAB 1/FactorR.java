import java.math.BigInteger;
import java.util.Scanner;

/* rite a program to find factorial of a number. (Using Recursion) */
class find
{
    //A Static method for Find Facotrial 
    public static BigInteger Factorial(Long Number)
    {
        //recursive statement using ternary oprator
        return Number == 1 ? BigInteger.ONE : BigInteger.valueOf(Number).multiply(Factorial(Number - 1));
    }
}
public class FactorR 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        //geting user input in long 
        System.out.print("Enter A Number :");
        long number=s.nextLong();
        s.close();
        //call the static method in side the printf state
        System.out.println("Factorial of your number is : "+find.Factorial(number)); 
    }    
}