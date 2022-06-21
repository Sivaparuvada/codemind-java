import java.util.Scanner;
class product
{
    public static void main(String args[])
    {
        float a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=(float)(a*b);
        System.out.format("%.2f",c);
    }
}