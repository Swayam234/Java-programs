import java.util.*;
class prime
{
    public static void main(String args[])
    {
        int num,i,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is a not  prime number");
        }
        
        
    }
}