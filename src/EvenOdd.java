import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        int sum_e=0,sum_o=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a four digit no: ");
        int n= scan.nextInt();
        System.out.println("Given no is:"+n);

        int r=n%10;
        if(r%2==0)
        {
            sum_e=sum_e+r;
        }
        else
        {
            sum_o=sum_o+r;
        }
        n=n/10;

        r=n%10;
        if(r%2==0)
        {
            sum_e=sum_e+r;
        }
        else
        {
            sum_o=sum_o+r;
        }
        n=n/10;

        r=n%10;
        if(r%2==0)
        {
            sum_e=sum_e+r;
        }
        else
        {
            sum_o=sum_o+r;
        }
        n=n/10;

        r=n%10;
        if(r%2==0)
        {
            sum_e=sum_e+r;
        }
        else
        {
            sum_o=sum_o+r;
        }

        System.out.println("Sum of all even digits: "+sum_e);
        System.out.println("Sum of all odd digits:"+sum_o);
    }
}

