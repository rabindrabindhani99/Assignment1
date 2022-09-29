class TempCoveAssign3
{
    public static void main(String[] args)
    {
        double temp_c1=34, temp_f1;
        System.out.println("Given temperature in celsius:"+temp_c1);
        temp_f1=(temp_c1*9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+temp_f1+"F");
        double temp_c2, temp_f2=102.2;
        System.out.println("Given temperature in Fahrenheit:"+temp_f2);
        temp_c2 =(temp_f2-32)*5/9;
        System.out.println("Temperature in Celsius: "+temp_c2+"c");
    }
}
