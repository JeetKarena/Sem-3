public class CQ 
{
    //Decalaration 
    int[] arr=new int[5];
    int Front=-1,Rear=-1;

    public void enQueue(int n)
    {
        if (Rear==arr.length && Front==Rear+1 ) 
        {
            System.out.println("Queue is full");
        } 
        else 
        {
            if(Rear==-1)
            {
                Front=0;
            }
            Rear=(Rear+1)%arr.length;
            arr[Rear]=n;
        }
    }
    public void deQueue()
    {
        if(Front==-1 || Rear==0) 
        {
            System.out.println("Queue is Emplty");
        } 
        else 
        {
            if(Front==Rear)
            {
                Front=-1;
                Rear=-1;
            }
            else
            {
                Front=(Front+1)%arr.length;
            }
        }
    }
    public void Display()
    {
        if (Front>Rear) {

            for(int i=Front;i<arr.length;i++)
            {
                 System.out.println(arr[i]);
            }
            for(int i=0;i<Rear;i++)
            {
                System.out.println(arr[i]);
            }
        } else 
        {
            for(int i=Front;i<=Rear;i++)
            {
                    System.out.println(arr[i]);
            }    
        }
    } 
}