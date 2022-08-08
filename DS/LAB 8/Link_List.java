class List
{
    static Node Head;
    public static class Node
    {
        Node next;
        int Data;
        public Node(int value)
        {
            Data=value;
            next=null;
        }
    }
    public static void insert(int a)
    {
        Node nNode=new Node(a);
        if(Head==null)
        {
            Head=nNode;
        }else
        {
            Node temp=Head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=nNode;
            // Head.next=nNode;
        }
    }
    public static void print()
    {
        Node tNode=Head;
        while(tNode != null) {
            System.out.print(tNode.Data + " ");
            tNode = tNode.next;
          }
          System.out.println();
    }
    public static void RemoveFirst()
    {
        if (Head==null) 
        {
            System.out.println("Only One Element is present ");
        } 
        else 
        {
            Head=Head.next;
        }
    }
    public static void RemoveLast()
    {
        if(Head==null)
        {
            System.out.println("Only One Element is present ");
        }
        else
        {
            Node tNode=Head;
            while(tNode.next.next!=null)
            {
                tNode=tNode.next;
            }
            tNode.next=null;

        }
    }
    public static void RemoveAt(int index) 
    {
        Node temp=Head;
        int i=2;
        if (index==1) 
        {
            Head=Head.next;    
        } else {

            while(i<index)
            {
                temp=temp.next;
                i++;
            }
            if(temp.next!=null)
            {
                temp.next=temp.next.next;
            }
        }

    }
    public static void SortList()
    {
        Node temp=Head;
        Node temp2;
        while(temp.next!=null)
        {
            temp2=temp.next;
            while(temp2.next!=null)
            {
                if(temp.Data>=temp2.Data)
                {
                    int d=temp.Data;
                    temp.Data=temp2.Data;
                    temp2.Data=d;
                }
                temp2=temp2.next;
            }
            temp=temp.next;

        }
    }


}
public class Link_List 
{
    public static void main(String[] args) {
        List.insert(5);
        List.insert(20);
        List.insert(10);
        List.insert(15);
        List.insert(30);
        List.insert(40);
        List.insert(60);
        List.insert(50);
        List.print();
        List.SortList();
        System.out.println("sorted list is  : ");
        List.print();
        List.RemoveLast();
        System.out.println();
        List.print();
        System.out.println("Remove at  : ");
        List.RemoveAt(5);
        List.print();
    }
} 