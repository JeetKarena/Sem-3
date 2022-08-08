import java.util.*;
public class Stk
{
    int[] arr=new int[100];
    int top=-1;
    Scanner s = new Scanner(System.in);
    int n,i;
    public void push(int n)
    {
        System.out.println("================ push ================");
        if (top>=100) 
        {
        System.out.println("Stack is over flow");    
        } else {
            top++;
            arr[top]=n;
        }
    }
    public int pop()
    {
        System.out.println("================ pop ================");
        if(top<0)
        {
            System.out.println("Stack is under flow");
        }
        
        return arr[top--];
    }
    public int peek()
    {
        // int temp;
        // temp=arr[top];
        System.out.println("================ peek ================");
        if(top<0)
        {
            System.out.println("Stack is under flow");
        }
    
        return arr[top];
    }
    public void change()
    {
        if(top==-1)
        {
            System.out.println("Stack is null");
        }
        else
        {

            System.out.print("Enter postion and new eliment : ");
            i = s.nextInt();
            n = s.nextInt();
            System.out.println("================ change ================");
            arr[--i]=n;
        }
    }
    public void display()
    {
        System.out.println("================ diplay ================");
        for (int i =0;i<=top;i++) 
        {
            System.out.println(arr[i]);
        }
    }
}