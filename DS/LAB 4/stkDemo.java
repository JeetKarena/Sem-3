import java.util.Scanner;

public class stkDemo {
    public static void main(String[] args) {
        //Stk Is Define In Other File Named Stk With All Methods
        //Objeact of Stack is refferd as st
        Stk st = new Stk();
        Scanner s = new Scanner(System.in);

        while (true) 
        {
            System.out.println();
            System.out.println("Enter what you want to do :");
            System.out.println("Press 1 For Push        : ");
            System.out.println("Press 2 For pop         : ");
            System.out.println("Press 3 For peek        : ");
            System.out.println("Press 4 For change      : ");
            System.out.println("Press 5 For display     : ");
            System.out.println("Press 6 For quit        : ");
            int opration = s.nextInt();
            int n;
            switch (opration) 
            {
                case 1:
                    System.out.print("Enter eliment to add : ");
                    n = s.nextInt();
                    st.push(n);
                    break;
                case 2:
                    System.out.println(st.pop());
                    break;
                case 3:
                    System.out.println(st.peek());
                    break;
                case 4:
                    st.change();
                    break;
                case 5:
                    System.out.println();
                    st.display();
                    break;
                default:
                    System.out.println("Plese Enter A valid opration ! ");
                    break;
            }
            if (opration == 6) {
                break;
            }
        }
        s.close();

    }
}
