import java.util.Scanner;
class ArthimeticDemo
{
   public static void main(String[] args)
    {
      int a=5;
      int b=10;
      Calculator c=new Calculator();
      c.add(a,b);
      c.sub(a,b);
      c.mul(a,b);
      c.div(a,b);
      c.mod(a,b);
  }
}
class CalculatorDemo
{
   void add(int a, int b)
   {
     
     System.out.println(a+b);
   }
   void sub(int a, int b)
   {
     
     System.out.println(a-b);
   }
 void mul(int a, int b)
   {
     
     System.out.println(a*b);
   }
       
 void div(int a, int b)
   {
     
     System.out.println(a/b);
   }
 void mod(int a, int b)
   {
     
     System.out.println(a%b);
   }
}
       

       

       






       

       
