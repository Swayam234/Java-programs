import java.util.*;
class DigitsSum 
{
    public static void main(String args[])
    {
        int num,r=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
        while(num>0)
        {
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println("The sum is:"+sum);
    }
}
