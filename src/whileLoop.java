import java.util.Scanner;

public class whileLoop
{
    public static void main(String[] args)
    {
        int i=0;
        System.out.println("Enter the range of the even number series.");
        Scanner scan = new Scanner(System.in);
        int lim = scan.nextInt();
        while(i<=lim)
        {
            System.out.println(i);
            i=i+2;
        }
    }
}
