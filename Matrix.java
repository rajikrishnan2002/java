import java.util.Scanner;
public class Matrix
 {
  public static void main(String[] args)
   {
     Scanner s1=new Scanner(System.in);
     System.out.print("Enter the number of rows and columns");
     int r=s1.nextInt();
     int c=s1.nextInt();
     int a[][]=new int[r][c];
     System.out.println("Enter the elements of matrix");
     for(int i=0;i<r;i++)
      {
       for(int j=0;j<c;j++)
        {
         a[i][j]=s1.nextInt();
        }
      }
     System.out.println("The matrix is");
     for(int i=0;i<r;i++)
      {
       for(int j=0;j<c;j++)
        {
         System.out.println(a[i][j]);
        }
      }
      
   }
 }