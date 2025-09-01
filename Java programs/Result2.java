import java.util.*;
class Result2 
{
    public static void main(String args[])
    {
        int rollno,Eng,Maths,Sci,total;
        float avg;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of a student:");
        name=sc.next();
        System.out.print("Enter the roll no of the student:");
        rollno=sc.nextInt();
        System.out.print("Enter the marks of english:");
        Eng=sc.nextInt();
        System.out.print("Enter the marks of maths:");
        Maths=sc.nextInt();
        System.out.print("Enter the marks of science:");
        Sci=sc.nextInt();
        total=Eng+Maths+Sci;
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
