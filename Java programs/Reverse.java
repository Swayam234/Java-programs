import java.util.*;
class Reverse   
{
    public static void main(String args[])
    {
        int num,r=0,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("The reverse is:"+rev);
    }
}
