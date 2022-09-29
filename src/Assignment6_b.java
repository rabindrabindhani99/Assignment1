public class Assignment6_b
{
    public static void main(String[] args)
    {
        int n=9631;
        System.out.println("Given no is: "+n);
        int s=0,t=0,d=0;
        d=n%10;
        t=d%2!=0?d:0;
        s=s+t;

        n=n/10;
        d=n%10;
        t=d%2!=0?d:0;
        s=s+t;

        n=n/10;
        d=n%10;
        t=d%2!=0?d:0;
        s=s+t;

        n=n/10;
        d=n%10;
        t=d%2!=0?d:0;
        s=s+t;

        System.out.println("Sum of all odd digits is:"+s);
    }
}
