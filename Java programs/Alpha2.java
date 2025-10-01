import java.util.*;
class Alpha2       //Character Program2
{
    public static void main(String args[])
    {
        int asciiCode;
        char c,newChar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        c=sc.next().charAt(0);
        if (Character.isUpperCase(c)) 
        {
            newChar = Character.toLowerCase(c);
        } 
        else 
        {
            newChar = Character.toUpperCase(c);
        }
        asciiCode = (int) newChar; 
        System.out.println("New letter: " + newChar);
        System.out.println("ASCII code: " + asciiCode);
        
    }
}
