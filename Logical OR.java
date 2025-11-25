import java.util.*;
class Main
{
    public static void main(String args[])
    {
      int a=9;
      int b=10;
      if(a>8 || b<11)
      {
        System.out.println("Logical OR is successfully executed..");
      }
      else
      {
        System.out.println(" Both conditions have failed..so else got executed.");
      }
      System.out.println("I am out of the block.So I always execute.");
    }
}