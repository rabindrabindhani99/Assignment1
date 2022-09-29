public class DigitAddAssign5_1
{
    public static void main(String[] args)
    {
        int a =5641;
        System.out.println("Given number is:"+a);
        int sum=a%10+(a/10)%10+(a/100)%10+(a/1000)%10;
        System.out.println("Sum of the digits: "+sum);
    }
}
