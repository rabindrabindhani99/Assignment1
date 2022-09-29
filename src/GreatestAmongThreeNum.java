import java.util.Scanner;

public class GreatestAmongThreeNum
{
    public static void main(String[] args) {
        int a,b,c,g;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        if(a>b)
        {
            if (a > c)
            {
                g = a;
            } else {
                g = c;
            }
        }
            else
            {
                if (b > c)
                {
                    g = b;
                } else
                {
                    g = c;
                }
            }
        System.out.println("Greatest No is: "+g);
        }
    }
