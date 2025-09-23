class Function7
{
    public static void main(String args[])
    {
        int result;
        Function7 f6= new Function7();
        result=f6.sum(6,9);
        System.out.println("Sum="+result); 
    }
    int sum(int x,int y)
    {
        return (x+y);
    }
}