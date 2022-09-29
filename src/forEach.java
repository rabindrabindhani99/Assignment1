import java.util.Scanner;

public class forEach
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scan.nextInt();
        int[] num=new int[size];
        System.out.println("Enter the elements into the array.");
        for(int i=0;i<size;i++)
        {
            num[i]=scan.nextInt();
        }
        for(int numbers:num)
        {
            System.out.println(numbers);
        }
    }
}
