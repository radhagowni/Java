import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Print enter the number for which you want to print the table.");
        n=sc.nextInt();
        PrintTheTable(n);
    }
    public static void PrintTheTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" "+"*"+" "+i+" "+"= "+(n*i));
        }
    }
}