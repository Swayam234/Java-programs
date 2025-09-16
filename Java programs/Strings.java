import java.util.*;
class Strings
{
    public static void main(String args[])
    {
        String st1,st2,st3;
        char c1,c2,c3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        st1=sc.next();
        System.out.print("Enter the second string:");
        st2=sc.next();
        System.out.print("Enter the first character:");
        c1=sc.next().charAt(0);
        System.out.print("Enter the second character:");
        c2=sc.next().charAt(0);
        System.out.println("First Character in Uppercase:"+Character.toUpperCase(c1));
        System.out.println("Second Character in Uppercase:"+Character.toUpperCase(c2));
        System.out.println("First String in Uppercase:"+st1.toUpperCase());
        System.out.println("Second String in Uppercase:"+st2.toUpperCase());
        System.out.print("Enter the character to replace at index 2:");
        c3 = sc.next().charAt(0);
        st3 = st1.substring(0, 2) + c3 + st1.substring(3);
        System.out.println("Modified String: " +st3);
    }
}