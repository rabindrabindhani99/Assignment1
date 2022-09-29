import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n,n1,se=0,so=0,d1=0,d2=0,ed1=0,ed2=0,od1,od2,r;
        System.out.println("Enter a four digit no:");
        n= scan.nextInt();
        System.out.println("Given no is: "+n);
        //For 4th and 3rd digit product
        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;
        ed1=(d1%2==0 &&(d1!=2 || d1!=6))?d1:0;
        ed2=(d2%2==0 &&(d2!=2 || d2!=6))?d2:0;
        se=se+ed1*ed2;

        od1=(d1%2!=0 &&(d1!=3 || d1!=7))?d1:0;
        od2=(d2%2!=0 &&(d2!=3 || d2!=7))?d2:0;
        so=so+od1*od2;
        //For 3rd and 2nd digit

        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;
        ed1=(d1%2==0 && d1!=2 && d1!=6)?d1:0;
        ed2=(d2%2==0 && d2!=2 && d2!=6)?d2:0;
        se=se+ed1*ed2;

        od1=(d1%2!=0 && d1!=3 && d1!=7)?d1:0;
        od2=(d2%2!=0 && d2!=3 && d2!=7)?d2:0;
        so=so+od1*od2;

        //For 2nd and 1st digit
        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;
        ed1=(d1%2==0 && d1!=2 && d1!=6)?d1:0;
        ed2=(d2%2==0 && d2!=2 && d2!=6)?d2:0;
        se=se+ed1*ed2;

        od1=(d1%2!=0 && d1!=3 && d1!=7)?d1:0;
        od2=(d2%2!=0 && d2!=3 && d2!=7)?d2:0;
        so=so+od1*od2;

        r=se-so;
        System.out.println("Sum of product of all even digits except 2 and 6 is: "+se);
        System.out.println("Sum of all odd digits except 3 and 7 is: "+so);
        System.out.println("Difference:"+r);



    }
}
