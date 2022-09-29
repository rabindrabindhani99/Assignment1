import java.util.Scanner;

public class Assignment7_3
{
    public static void main(String[] args) {
        int n,count =0,count_o=0,sum=0,t,r,sum_o=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a four digit integer:");
        n=scan.nextInt();
        System.out.println("Given no is: "+n);
        r=n%10;
        t= (r%2==0 && r%4 !=0)?sum=sum+r:r;
        t=(r%2==0 && r%4 !=0)?count++:r;
        t= (r%2!=0 && r%3!=0)?sum_o=sum_o+r:r;
        t=(r%2!=0 && r%3!=0)?count_o++:r;

        n=n/10;
        r=n%10;
        t= (r%2==0 && r%4 !=0)?sum=sum+r:r;
        t=(r%2==0 && r%4 !=0)?count++:r;
        t= (r%2!=0 && r%3!=0)?sum_o=sum_o+r:r;
        t=(r%2!=0 && r%3!=0)?count_o++:r;

        n=n/10;
        r=n%10;
        t= (r%2==0 && r%4 !=0)?sum=sum+r:r;
        t=(r%2==0 && r%4 !=0)?count++:r;
        t= (r%2!=0 && r%3!=0)?sum_o=sum_o+r:r;
        t=(r%2!=0 && r%3!=0)?count_o++:r;

        n=n/10;
        r=n%10;
        t= (r%2==0 && r%4 !=0)?sum=sum+r:r;
        t=(r%2==0 && r%4 !=0)?count++:r;
        t= (r%2!=0 && r%3!=0)?sum_o=sum_o+r:r;
        t=(r%2!=0 && r%3!=0)?count_o++:r;

        float even_avg = (float)sum/count;
        float odd_avg = (float)sum_o/count_o;

        float diff= even_avg-odd_avg;
        System.out.println("Result: "+diff);

    }
}
