/* Read n numbers in an array then read two different numbers, replace 1st number with 2nd number in an array and print its index and final array */
import java.util.Scanner;
class arr
{
    int[] arr;
    public arr()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the lenth of array : ");
        arr=new int[s.nextInt()]; 

        //geting eliments from user
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter Eliment No "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
        s.close();
    }
    public void replaceEliment(int OldEliment,int NewEliment)
    {
        //here we have s variable as if do not found the eliment so we can mass it  if s==arr length so eliment is not found
         int s=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==OldEliment) 
            {
                arr[i]=NewEliment;
                System.out.println((i)+" index of array eliment is updated with "+NewEliment);
            } else 
            {
                s++;
            }
        }
        System.out.println(s>=arr.length?"Eliment is Not found in array":"Task performed Success fully....");
    }

}
public class ArrayNumReplace 
{
    public static void main(String[] args) 
    {
        arr a=new arr();
        a.replaceEliment(3, 4);
    }    
}