class Alpha5 
{
    public static void main(String[] args) 
    {
        char a = 'H';
        char b = 'A';
        int difference = a - b; 
        System.out.println("Character 1 (H) value: " + (int)a); 
        System.out.println("Character 2 (A) value: " + (int)b); 
        System.out.println("The difference between " + a + " and " + b + " is: " + difference); 

        // Example: Finding the next character
        char nextChar = (char) (a + 1);
        System.out.println("The character after " + a + " is: " + nextChar); 
    }
}
