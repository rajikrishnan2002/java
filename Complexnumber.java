public class Complexnumber
 {
  double real,img;
  Complexnumber(double r, double i)
   {
    this.real=r;
    this.img=i;
   }
 public static Complexnumber
 sum(Complexnumber c1,Complexnumber c2)
  {
   Complexnumber temp=new Complexnumber(0,0);
   temp.real=c1.real+c2.real;
   temp.img=c1.img+c2.img;
   return temp;
   }
public static void main(String args[])
 {
  Complexnumber c1=new Complexnumber(7.5,6);
  Complexnumber c2=new Complexnumber(1.2,4.5);
  Complexnumber temp=sum(c1,c2);
  System.out.println("Sum is"+temp.real+"+"+temp.img+"i");
 }
 }