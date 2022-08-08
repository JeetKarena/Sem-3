import java.util.*;
	class PreFix_Eval
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

		public static void opr(int c){
			int op1,op2,value;
			switch(c){
				case 43:
					op1=  pop();
					op2=  pop();
					value=op1+op2;
					  push(value);
					break;

				case 45:
					op1=  pop();
					op2=  pop();
					value=op1-op2;
					  push(value);
					break;

				case 42:
					op1=  pop();
					op2=  pop();
					value=op1*op2;
					  push(value);
					break;

				case 47:
					op1=  pop();
					op2=  pop();
					value=op1/op2;
					  push(value);
					break;
			}
		}
	}
	public class PreFix_Eval_Demo{
		public static void main(String[] args){
			Scanner s=new Scanner(System.in);

			System.out.print("Enter Prefix EXpression: ");
			String str=s.nextLine();
			s.close();
			for(int i=str.length()-1;i>=0;i--){
				int c=str.charAt(i);

				if(c==45 || c==43 || c==42 || c==47){
					PreFix_Eval.opr(c);
				}
				else{
					int temp=(int)c-48;
					PreFix_Eval.push(temp);
				}
			}
			System.out.print("Soluitn is : "+ PreFix_Eval.pop());

		}
	} 