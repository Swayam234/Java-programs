import java.util.*;
class forLoop4
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("sum="+sum); 
    }
}
