public class CQDemo 
{
    public static void main(String[] args) 
    {
        CQ obj=new CQ();

        obj.enQueue(5);
        obj.enQueue(10);
        obj.enQueue(15);
        obj.enQueue(20);
        obj.enQueue(25);

        obj.deQueue();
        obj.deQueue();

        obj.Display();

        obj.enQueue(30);
        obj.enQueue(40);
        obj.enQueue(50);
        System.out.println("NEW LIST ");
        obj.Display();
    }    
}