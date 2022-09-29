import java.util.Scanner;

public class EvenOddAvg
{
    public static void main(String[] args)
    {
        int sum_e=0,sum_o=0,count_even=0,count_odd=0;
        double even_avg,odd_avg;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a four digit no: ");
        int n= scan.nextInt();
        System.out.println("Given no is:"+n);

        int r=n%10;
        if(r%2==0)
        {
            sum_e=sum_e+r;
            count_even++;
        }
        else
        {
            sum_o=sum_o+r;
            count_odd++;
        }
        n=n/10;

        r=n%10;
        if(r%2==0)
        {
            sum_e=sum_e+r;
            count_even++;
        }
        else
        {
            sum_o=sum_o+r;
            count_odd++;
        }
        n=n/10;

        r=n%10;
        if(r%2==0)
        {
            sum_e=sum_e+r;
            count_even++;
        }
        else
        {
            sum_o=sum_o+r;
            count_odd++;
        }
        n=n/10;

        r=n%10;
        if(r%2==0)
        {
            sum_e=sum_e+r;
            count_even++;
        }
        else
        {
            sum_o=sum_o+r;
            count_odd++;
        }
        even_avg=(double) sum_e/count_even;
        odd_avg=(double) sum_o/count_odd;

        System.out.println("Sum of all even digits: "+sum_e);
        System.out.println("Sum of all odd digits:"+sum_o);
        System.out.println("Average of all even digits: "+even_avg);
        System.out.println("Average of all odd digits: "+odd_avg);
    }
}
