import java.util.*;
class Alpha1    //Character Program1
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)==true)
           System.out.println("Upper");
        if(Character.isLowerCase(ch)==true)
           System.out.println("Lower");
        if(Character.isLetter(ch)==true)
           System.out.println("Letter");
        if(Character.isDigit(ch)==true)
           System.out.println("Digit");
        
    }
}