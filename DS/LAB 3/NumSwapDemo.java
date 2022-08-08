class Swap
{
    public static void SwapNUM(int x,int y)
    {
        System.out.println("Before Swaping : "+x+" , "+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swaping : "+x+" , "+y);

    }
}
public class NumSwapDemo {
    public static void main(String[] args) {
        Swap.SwapNUM(10, 20);
    }

}