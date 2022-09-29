public class ConsProdSumAssign5_4
{
    public static void main(String[] args)
    {
        int n=8542;
        System.out.println("Given number is: "+n);
        int one_st,ten_th,hund_th,thou_nd,sum=0;
        one_st=n%10;
        ten_th=n/10%10;
        sum=one_st*ten_th;
        hund_th=n/100%10;
        sum=sum+ten_th*hund_th;
        thou_nd=n/1000%10;
        sum=sum+hund_th*thou_nd;
        System.out.println("Sum of the product of the consecutive digits are:"+sum);
    }
}
