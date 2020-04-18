class Trycatchdemo
{
 public static void main(String[] args)
 {
   method1();

   }
  public static void method1()
  {
    try{
        System.out.println("answer="+20/0);
    }
     catch(ArrayIndexOutOfBoundsException e)
     {
     	System.out.println("array index out of bounds exception");
     }
     catch(ArithmeticException e)
     {
      System.out.println("Division by zero");
     }
     catch(Exception e)
     {
     	System.out.println("Generic exception");
     }
     System.out.println("After try catch");

  }
 }