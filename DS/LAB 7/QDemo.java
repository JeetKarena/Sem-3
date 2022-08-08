import java.util.Scanner;

public class QDemo 
{
    public static void main(String[] args) {
        Q obj =new Q();
        Scanner s=new Scanner(System.in);
        int opration;
        while(true)
        {
            System.out.println("Enter 1 : For enQue     : ");
            System.out.println("Enter 2 : For deQue     : ");
            System.out.println("Enter 3 : For Diplay    : ");
            System.out.println("Enter 4 : For Quit      : ");
            opration=s.nextInt();
            switch(opration)
            {
                case 1:
                System.out.print("Enter Number : ");
                obj.enQue(s.nextInt());
                break;
                case 2 :
                System.out.println(obj.deQue()); 
                break;
                case 3:
                obj.Display();
                break;

                default :
                System.out.println("Please Enter A valid Opration ");
            }
            if(opration==4)
            {
                break;
            }
        }
        s.close();
    }
}