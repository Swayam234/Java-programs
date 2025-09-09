import java.util.*;
class digits
{
    public static void main(String args[])
    {
        int num,r=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        while(num>0)
        {
            r=num%10;
            System.out.println(r);
            num=num/10;
        }
        
    }
}
