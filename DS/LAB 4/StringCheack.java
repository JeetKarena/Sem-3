import java.util.Scanner;
public class StringCheack
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter AB Series : ");
		String string = sc.next();
		sc.close();
		String str = string.toLowerCase();
		int charnotAB = 0 , countA = 0 , countB = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!='a' && str.charAt(i)!='b')
			{
				charnotAB++;
				break;
			}
			if(str.charAt(i)=='a')
			{
				countA++;
			}
			if(str.charAt(i)=='b')
			{
				countB++;
			}
		}
		if(charnotAB==0 && countA==countB)
		{
			System.out.println("A and B are equals In which A = "+countA+" B = "+countB);
		}
		if(charnotAB!=0)
		{
			System.out.println("Please Enter String which contain A and B only");
		}
		if(countA!=countB){
			System.out.println("Here, A and B are Not equal ! A = "+countA+" B = "+countB);
		}
	}
} 