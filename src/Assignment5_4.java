public class Assignment5_4
{
    public static void main(String[] args) {
        int n=6874;
        System.out.println("Given no is:"+n);
        int a,b;
        a=(n/100)%10;
        b=n%10;
        int bit_and =a&b;
        int bit_or = a|b;
        int bit_xor = a^b;
        System.out.println("Bitwise AND of 2nd and 4th digit is: "+bit_and);
        System.out.println("Bitwise OR of 2nd and 4th digit is: "+bit_and);
        System.out.println("Bitwise XOR of 2nd and 4th digit is: "+bit_xor);

    }
}
