import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        int num,rev=0,temp=0,r=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        temp=num;
         while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if(temp==rev)
           System.out.println("It is a Palindrome number");
        else
           System.out.println("It is not a Palindrome number"); 
  }
}
