import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter three elements: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    hasNotTeen(a,b,c);
    }
    public static void hasNotTeen(int a,int b,int c)
    {
        if((a>=13 && a<=19) && (b>=13 && b<=19) && (c>=13 && c<=19))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
  
        }
    }
}
