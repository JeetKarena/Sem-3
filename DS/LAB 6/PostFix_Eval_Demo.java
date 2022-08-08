import java.util.Scanner;
class postfix_Eval
{

	static int[] stack=new int[100];
	static int top=-1;



	public static void push(int c){
		if(top>=100){
			System.out.println("Stack Overflow.");
		}
		else{
			stack[++top]=c;
		}
	}

	public static int pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		return stack[top--];
	}

	public static void Opraton(int Char){
		int op1,op2,value;
		switch(Char){
			case 43:
				op2= pop();
				op1= pop();
				value=op1+op2;

				 push(value);
				break;

			case 45:
				op2= pop();
				op1= pop();
				value=op1-op2;

				 push(value);
				break;

			case 42:
				op2= pop();
				op1= pop();
				value=op1*op2;

				 push(value);
				break;

			case 47:
				op2= pop();
				op1= pop();
				value=op1/op2;

				 push(value);
				break;

		}
	}


}
public class PostFix_Eval_Demo
{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);

		System.out.print("enter postfix expression: ");
		String str=s.nextLine();

		for(int i=0;i<str.length();i++){
			int c=str.charAt(i);

			if(c==45 || c==43 || c==42 || c==47){
				postfix_Eval.Opraton(c);
			}
			else{
				int temp=(int)c-48;
				postfix_Eval.push(temp);
			}
		}
		System.out.print(" Solution is : "+postfix_Eval.pop());
		s.close();
	}
} 