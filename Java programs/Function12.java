import java.util.*;
class Function12
{
    public static void main(String args[])
    {
        int s,l,b,h;
        double r;
        Scanner sc = new Scanner(System.in);
        Function12 c = new Function12();
        System.out.print("Enter the side:");
        s=sc.nextInt();
        System.out.print("Enter the radius:");
        r=sc.nextDouble();
        System.out.print("Enter the length:");
        l=sc.nextInt();
        System.out.print("Enter the breadth:");
        b=sc.nextInt();
        System.out.print("Enter the height:");
        h=sc.nextInt();
        c.volume(s);
        c.volume(r);
        c.volume(l,b,h);    
    }
    void volume(int side)
    {
        System.out.println("The volume of the cube is:"+(side*side*side));
    }
    void volume(double rad)
    {
        System.out.println("The volume of the sphere is:"+(4/3*3.14*rad*rad*rad));
    }
    void volume(int len,int br,int he)
    {
        System.out.print("The volume of the cuboid is:"+(len*br*he));
    }
}
