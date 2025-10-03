import java.util.*;
class Alpha3
{
    public static void main(String[] args) 
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
        char lowerCh = Character.toLowerCase(ch); 
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') 
        {
            System.out.println(ch + " is a Vowel.");
        } 
        else if (Character.isLetter(ch)) 
        {
            System.out.println(ch + " is a Consonant.");
        } 
        else 
        {
            System.out.println(ch + " is not an alphabet letter.");
        }
    }
}