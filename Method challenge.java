import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int marks;
        String Name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        Name=sc.nextLine();
        System.out.println("Enter marks:");
        marks=sc.nextInt();
        CalculateGrade(Name,marks);
    }
    public static void CalculateGrade(String name,int marks)
    {
       if(marks>90 && marks<=100)
       {
                System.out.println("Grade A");
       }
       else if(marks>80 && marks<=90)
       {
               System.out.println("Grade B");
       }
       else if(marks>70 && marks<=80)
       {
               System.out.println("Grade C");

       }
       else if(marks>60 && marks<=70)
       {
               System.out.println("Grade D");

       }
       else{
               System.out.println("Grade E");

       }

    }
}
