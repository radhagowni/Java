import java.util.*;
class Main
{
    public static void main(String args[])
    {
      int a=9;
      int b=10;
      if(a>8 && b<11)
      {
        System.out.println("Logical AND is successfully executed..");
      }
      else
      {
        System.out.println(" Any one of the conditions have failed..so else got executed.");
      }
      System.out.println("I am out of the block.So I always execute.");
    }
}