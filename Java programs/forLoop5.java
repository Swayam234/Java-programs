import java.util.*;
class forLoop5
{
   public static void main(String args[])
   {
        int i,Maths,Eng,Sci,total;
        float avg;
        String name;
        Scanner sc=new Scanner(System.in);
        for(i=1;i<=3;i++)
        {
            System.out.print("Enter the name:");
            name=sc.next();
            System.out.print("Enter the marks of Maths:");
            Maths=sc.nextInt();
            System.out.print("Enter the marks of English:");
            Eng=sc.nextInt();
            System.out.print("Enter the marks of Science:");
            Sci=sc.nextInt();
            total=Maths+Eng+Sci;
            System.out.println("The total is:"+total);
            avg=total/3;
            System.out.println("The average is:"+avg);
            if(avg<35)
            {
                System.out.println("Fail");
            }
            else if(avg>=35 && avg<49)
            {
                System.out.println("Pass");
            }
            else if(avg>=49 && avg<=59)
            {
                System.out.println("Second");
            }
            else if(avg>=60)
            {
                System.out.println("First");
            }  
       }
   }
}