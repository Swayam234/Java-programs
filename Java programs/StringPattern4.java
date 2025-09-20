import java.util.*;
class StringPattern4
{
    public static void main(String args[])
    {
        int i,j,l,ch;
        String s = "HAPPY";
        Scanner sc = new Scanner(System.in);
        do
        {
         System.out.println("Pattern program");
         System.out.println("1.Triangle Pattern");
         System.out.println("2.Inverted Triangle Pattern");
         System.out.print("Enter a choice:");
         ch=sc.nextInt();
         switch(ch)
         {
            case 1:
            l=s.length(); 
            for(i=0;i<l;i++) 
            {
                for(j=0;j<=i;j++)
                {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
            break;
            case 2:
            l=s.length();
            for(i=l;i>=0;i--)
            {
                for(j=0;j<i;j++)
                {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
            break;
         }
    }while(ch<=2);     
  }
}