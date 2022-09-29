import java.util.Scanner;

public class largestNo
{
    public static void main(String[] args)
    {
        int x, y,z;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the First number:");
        x= scan.nextInt();
        System.out.println("Enter the Second number:");
        y= scan.nextInt();
        System.out.println("Enter the third number:");
        z=scan.nextInt();
        if(x==y && x==z)
        {
            System.out.println("All numbers are same.");
        }
        else {
            if (x > y) {
                if (x > z) {
                    System.out.println("X is greatest.");
                } else {
                    System.out.println("Z is greatest.");
                }

            } else {
                if (y > z) {
                    System.out.println("Y is greatest.");
                } else {
                    System.out.println("Z is greatest");
                }
            }
        }
    }
}
