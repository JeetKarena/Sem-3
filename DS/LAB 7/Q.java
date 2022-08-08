public class Q 
{
    int Front=0,Rear=-1;
    int Arr[]=new int[100];
    public void enQue(int N)
    {
        if(Rear>=100)
        {
            System.out.println("Que is Over flow");
        }
        else
        {
            Rear++;
            Arr[Rear]=N;
        }
    }
    public int deQue()
    {
        if(Rear<=0)
        {
            System.out.println("Que is Under Flow");
        }
        else
        {
             return Arr[Front++];             
        }
        return 0;
    }
    public void Display()
    {
        for(int i=Front;i<=Rear;i++)
        {
            System.out.println(Arr[i]);
        }
    }

}