import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          sum+=arr[i];
           System.out.print(arr[i]+" ");
        }
       System.out.println(' ');

        System.out.println("Sum: "+sum);

        // inorder to print the array elements in a single line without for loop ,we use Arrays.toString()
        System.out.println("The array: "+ Arrays.toString(arr));
    }
}