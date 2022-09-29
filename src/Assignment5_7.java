public class Assignment5_7
{
    public static void main(String[] args) {
        int n=9417,r=0,sum=0,temp=0;
        sum=n%10+n/10%10+n/100%10+n/1000%10;
        int third_digit=n/10%10;
        int left_shift=sum<<third_digit;
        int right_shift=sum>>third_digit;
        int zero_fill =sum>>>third_digit;
        System.out.println("Left shift result= "+left_shift);
        System.out.println("Right shift result= "+right_shift);
        System.out.println("Zero fill result= "+zero_fill);
    }
}
