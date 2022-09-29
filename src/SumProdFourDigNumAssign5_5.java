public class SumProdFourDigNumAssign5_5
{
    public static void main(String[] args)
    {
        int s=0,d1=0,d2=0;
        int n1=8549;
        System.out.println("First four digit number is: "+n1);
        int n2=6917;
        System.out.println("Second four digit number is: "+n2);
        d1=n1%10;
        d2=n2%10;
        s=s+d1*d2;

        n1=n1/10;
        n2=n2/10;
        d1=n1%10;
        d2=n2%10;
        s=s+d1*d2;

        n1=n1/10;
        n2=n2/10;
        d1=n1%10;
        d2=n2%10;
        s=s+d1*d2;

        n1=n1/10;
        n2=n2/10;
        d1=n1%10;
        d2=n2%10;
        s=s+d1*d2;
        System.out.println("Sum= "+s);
    }
}
