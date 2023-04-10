import java.io.*;
import java.util.Scanner;
public class Sample
 {
  public static void main(String[] args)
   {
     Scanner s1=new Scanner(System.in);
     System.out.print("Enter the first number:");
     int a=s1.nextInt();
     System.out.println("The number is:"+a);
     Scanner s2=new Scanner(System.in);
     System.out.print("Enter the second number");
     int b=s2.nextInt();
     int c=a+b;
     System.out.println("The sum is "+c);
     }
  }