public class Assignment5_6
{
    public static void main(String[] args) {
        int n=6892;
        int second,forth;
        second = n/100;
        forth= n%10;
        double bit_and=second & forth;
        double bit_or=second | forth;
        double bit_xor=second ^ forth;

        System.out.println("Bitwise AND= "+bit_and);
        System.out.println("Bitwise OR= "+bit_or);
        System.out.println("Bitwise XOR= "+bit_xor);
    }
}
