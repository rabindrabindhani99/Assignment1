import java.util.Scanner;

public class outputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.println(("Enter a String followed by space and a maximum 3 digit integer:"));
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        sc.close();
        System.out.println("================================");

    }
}

