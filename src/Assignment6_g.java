class Assignment6_g
{
    public static void main(String[] args)
    {
        int n=1234,m=4567;
        System.out.println("Given First number is: "+n);
        System.out.println("Givem Second number is: "+m);
        int r1,r2,t1,t2;
        int sum=0;
        r1=n%10;
        r2=m%10;

        t1=r1%2==0?r1:0;
        t2=r2%2!=0?r2:0;
        sum=sum+(t1*t2);
        n=n/10;
        m=m/10;

        r1=n%10;
        r2=m%10;
        t1=r1%2==0?r1:0;
        t2=r2%2!=0?r2:0;
        n=n/10;
        m=m/10;
        sum=sum+(t1*t2);

        r1=n%10;
        r2=m%10;
        t1=r1%2==0?r1:0;
        t2=r2%2!=0?r2:0;
        n=n/10;
        m=m/10;
        sum=sum+(t1*t2);

        r1=n%10;
        r2=m%10;
        t1=r1%2==0?r1:0;
        t2=r2%2!=0?r2:0;


        sum=sum+(t1*t2);
        System.out.println("Result: "+sum);
    }
}