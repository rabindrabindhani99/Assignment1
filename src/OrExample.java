import java.util.Scanner;

public class OrExample
{
    public static void main(String[] args)
    {
        int a;
        float b;
        float c;
        float d;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        a=input.nextInt();
        System.out.println("Enter an Float: ");
        b=input.nextFloat();
        System.out.println("Enter an Float: ");
        c=input.nextFloat();

        d=a+b+c;
        System.out.println("Result:"+d);
        if(a>b||c>d)
        {
            System.out.println("Satisfies Condition");
        }
        else
        {
            System.out.println("Condition not Satisfied");
        }
    }
}
