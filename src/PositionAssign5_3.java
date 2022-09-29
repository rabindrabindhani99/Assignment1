class PositionAssign5_3
{
    public static void main(String[] args)
    {
        int n=9567;
        System.out.println("Given no is: "+n);
        System.out.println("1th position value:"+n%10);
        System.out.println("10th position value:"+(n/10)%10);
        System.out.println("100th position value:"+(n/100)%10);
        System.out.println("1000nd position value:"+(n/1000)%10);
    }
}