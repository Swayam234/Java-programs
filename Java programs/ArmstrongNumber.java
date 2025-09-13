import java.util.*;
class Armstrong
{
    public static void main(String args[])   
    {
        int i,num,sum=0,r,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        temp=num;
        while(num>0) 
        {
            r=num%10; 
            sum=sum+(r*r*r); 
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("It is an armstrong number");
        }
        else
        {
            System.out.println("It is not an armstrong number");
        }
    }
}    
    