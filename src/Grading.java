import java.util.Scanner;

public class Grading
{
    public static void main(String[] args) {
        int m,v;
        char g;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your mark: ");
        m=scan.nextInt();
        if(m>35 && m<=50)
        {
            v=4;
        }
        else if(m==60 || m==70 || m==80 || m==90 || m==100)
        {
            v =(m/10)-1;
        }
        else
        {
            v=m/10;
        }
        switch (v)
        {
            case 0:
            case 1:
            case 2:
            case 3:
                g='F';
                break;
            case 4:
                g='D';
                break;
            case 5:
                g='C';
                break;
            case 6:
                g='B';
                break;
            case 7:
                g='A';
                break;
            case 8:
                g='E';
                break;
            case 9:
                g='O';
                break;
            default:
                g='S';
            System.out.println("Invalid mark. Enter mark between 0 to 100");
        }
        System.out.println("Your mark is "+m+". Your Grade is: "+g);
    }
}
