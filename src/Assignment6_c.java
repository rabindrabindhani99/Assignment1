public class Assignment6_c
{
    public static void main(String[] args) {
        int n=6152,count =0,count_o=0,sum=0,t,r,sum_o=0;
        System.out.println("Given no is: "+n);
        r=n%10;
        t= (r%2==0 && r%4 !=0)?sum=sum+r:0;
        t=(r%2==0 && r%4 !=0)?count++:0;
        t= (r%2!=0 && r%3!=0)?sum_o=sum_o+r:0;
        t=(r%2!=0 && r%3!=0)?count_o++:0;

        n=n/10;
        r=n%10;
        t= (r%2==0 && r%4 !=0)?sum=sum+r:0;
        t=(r%2==0 && r%4 !=0)?count++:0;
        t= (r%2!=0 && r%3!=0)?sum_o=sum_o+r:0;
        t=(r%2!=0 && r%3!=0)?count_o++:0;

        n=n/10;
        r=n%10;
        t= (r%2==0 && r%4 !=0)?sum=sum+r:0;
        t=(r%2==0 && r%4 !=0)?count++:0;
        t= (r%2!=0 && r%3!=0)?sum_o=sum_o+r:0;
        t=(r%2!=0 && r%3!=0)?count_o++:0;

        n=n/10;
        r=n%10;
        t= (r%2==0 && r%4 !=0)?sum=sum+r:0;
        t=(r%2==0 && r%4 !=0)?count++:0;
        t= (r%2!=0 && r%3!=0)?sum_o=sum_o+r:0;
        t=(r%2!=0 && r%3!=0)?count_o++:0;

        float even_avg = (float)sum/count;
        float odd_avg = (float)sum_o/count_o;

        float diff= even_avg-odd_avg;
        System.out.println("Result: "+diff);
}
}
