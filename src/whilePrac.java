import java.util.Scanner;

public class whilePrac
{
    public static void main(String[] args)
    {
        int i=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the range: ");
        int lim = scan.nextInt();
        while (i<lim)
        {
            i=i+2;
            System.out.println(i);
        }
    }
}
