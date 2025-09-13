import java.util.*;
class Factors
{
    public static void main(String args[])
    {
        int i,num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
             System.out.println(i);
             sum=sum+i;
            }
        }
        System.out.println("The sum is:"+sum);
    }
}
