public class FacePositionAssign5_2
{
    public static void main(String[] args)
    {
        int n=8971;
        System.out.println("The Given No is:"+n);
        int f1,f2,f3,f4,p1,p2,p3,p4;
        f4=n%10;
        f3=(n/10)%10;
        f2=(n/100)%10;
        f1=(n/1000)%10;
        p4= f4;
        p3=10*f3;
        p2=100*f2;
        p1=1000*f1;
        System.out.println("===========================================");
        System.out.println("Face Value of 1st digit="+f1);
        System.out.println("Face Value of 2nd digit="+f2);
        System.out.println("Face Value of 3rd digit="+f3);
        System.out.println("Face Value of 4th digit="+f4);
        System.out.println("===========================================");
        System.out.println("Place Value of right most digit is:"+p1);
        System.out.println("Place Value of middle right digit="+p2);
        System.out.println("Place Value of middle left digit="+p3);
        System.out.println("Place Value of left most digit="+p4);

    }
}
