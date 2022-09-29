import java.util.Scanner;

public class forLoop
{
    public static void main(String[] args)
    {
        float a=35.6f;
        System.out.println("Enter a number till which you want to add the numbers:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum=0;
        for(int i=1;i<=x;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum till "+x+" is:"+sum);
        System.out.println(a);
    }
}
