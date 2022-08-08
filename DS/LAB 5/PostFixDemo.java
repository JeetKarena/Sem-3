class infix{
	static char [] stack=new char[100];
	static int top=-1;

	public static void push(char a){
		if(top>=99){
			System.out.println("Stack overflow");
		}
		else{
			top++;
			stack[top]=a;
		}
	} 
	public static char pop(){
		if(top<=-1){
			System.out.println("Stack is underflow");
			return '0';
		}
		else{
			return stack[top--];
		}
	}
	public static char peek(){
		if(top<=-1){
			System.out.println("Stack is underflow");
			return '0';
		}
		else{
			return stack[top];
		}
	}
	public static boolean isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
    public static int pre(char ch){
		if(ch=='+'||ch=='-'){
			return  1;
		}
		else if(ch=='*'||ch=='/'){
			return 2;
		}
        else if(ch=='^')
        {
            return 3;
        }
		else {
			return 0;
		}
	}
    public static String ToPostFix(String str) 
    {
        String postfix="";
        for(int i=0;i<str.length();i++){
			char c=str.charAt(i);

			if(Character.isLetter(c)){
				postfix+=c;
			}
			else if(c=='('){
				push(c);
			}
			else if(c==')'){
				while(peek()!='('){
					postfix+= pop();
				}
				 pop();
			}
			else{
				if(!isEmpty() && pre(c)<=pre(peek())){
					postfix+= pop();
				}
				 push(c);
			}
		}
		while(!isEmpty()){
			postfix+= pop();
		}
        return postfix;   
    }
}
public  class PostFixDemo 
{
    public static void main(String[] args) {
		String str="(a+b)*c/d";
		System.out.println(infix.ToPostFix(str));
	}
} 