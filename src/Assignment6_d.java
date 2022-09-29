public class Assignment6_d
{
    public static void main(String[] args) {
        int n=1624;
        System.out.println("Given no is:"+n);
        int d1,d2,d3,d4,t1,t2,t3,t4,sum=0;

        d1=n%10;
        t1=d1%2==0?d1:0;

        n=n/10;
        d2=n%10;
        t2=d2%2==0?d2:0;
        sum=sum+t1*t2;

        n=n/10;
        d3=n%10;
        t3=d3%2==0?d3:0;
        sum=sum+t2*t3;

        n=n/10;
        d4=n%10;
        t4=d4%2==0?d4:0;
        sum=sum+t3*t4;

        System.out.println("Sum of product of consecutive even digit no:"+sum);
    }
}
