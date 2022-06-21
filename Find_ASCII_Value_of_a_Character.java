import java.util.Scanner;
class ascii_value
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println(+ch);
    }
}