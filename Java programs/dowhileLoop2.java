import java.util.*;
class dowhileLoop2
{
    public static void main(String args[])
    {
        int choice,r,s,l,b;
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println("Area");
        System.out.println("1.Circle");
        System.out.println("2.Square");
        System.out.println("3.Rectangle");
        System.out.println("4.Exit");
        System.out.print("Enter your choice: ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.print("Enter the radius:");
                   r=sc.nextInt();
                   System.out.println("The area of the circle is:"+(3.14*r*r));
                   break;
            case 2:System.out.print("Enter the side:");
                   s=sc.nextInt();
                   System.out.println("The area of the square is:"+(s*s));
                   break;
            case 3:System.out.print("Enter the length:");
                   l=sc.nextInt();
                   System.out.print("Enter the breadth:");
                   b=sc.nextInt();
                   System.out.println("The area of the rectangle is:"+(l*b));
                   break;
            case 4:break;
            default:System.out.println("Invalid");                
        }
    }while(choice!=4);    
 }
}