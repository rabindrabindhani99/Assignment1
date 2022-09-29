import java.util.Scanner;

public class OperatorExample
{
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        scan.close();

        if (a>b && b>c)
        {
            System.out.println("a>b>c");
        }
        else
        {
            System.out.println("Not as per the condition.");
        }
    }
}
