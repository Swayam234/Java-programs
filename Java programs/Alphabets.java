import java.util.*;
class Alphabets
{
    public static void main(String args[])
    {
        char choice;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet(a-g):");
        choice=sc.next().charAt(0);
        switch(choice)
        {
            case 'a': System.out.println("Apple");
                      break;
            case 'b': System.out.println("bat");
                      break;
            case 'c': System.out.println("cat");
                      break;
            case 'd': System.out.println("dog");
                      break;
            case 'e': System.out.println("elephant");
                      break;
            case 'f': System.out.println("fish");
                      break;
            case 'g': System.out.println("goat");
                      break;
            default:System.out.println("Invalid");          
                                                                        
                      
        }
    }
}
