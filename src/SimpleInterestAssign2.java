import java.util.Scanner;

public class SimpleInterestAssign2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Principle amount: ");
        float principle =scan.nextFloat();
        System.out.println("Enter the rate of interest per year");
        float rate = scan.nextFloat();
        System.out.println("Enter the amount of time in years");
        float time= scan.nextFloat();
        float SI=principle * (rate*0.01f)* time;
        System.out.println("The simple interest is: "+SI+" rupees");

    }
}
