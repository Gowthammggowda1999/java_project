
import java.util.Scanner;

abstract class sample
{
    sample(){

    }
  abstract void fibonacci(int no);
  abstract void prime_no(int a);
 }



abstract class demo extends sample
{
  void fibonacci(int no)
  {    
      int f1=0;
      int f2=1;
      int f3=0;
      System.out.println(f1+"\n"+f2);
      for(int i =1;i<no-2;i++)
      {
          f3=f1+f2;
          System.out.println(f3);
          f1=f2;
          f2=f3;
      } 
      	 
  }
}

class Abstract_main extends demo
{
 void prime_no(int a) 
 {
     for (int i=1;i<=a;i++)
     {
         boolean flag = true;

         for(int j=2;j<i;j++)
         {
             if(i%j==0)
             {
                 flag = false;
                 break;
             }
         }
             if(flag==true)
             {
                 System.out.println("Its a prime no "+ i);
             }
         }
         
     }
 
 public static void main (String[] args)
 {
     Scanner sc = new Scanner(System.in);
     Abstract_main A1 = new Abstract_main();
     System.out.println("enter the number for fibonacci ");
     int a = sc.nextInt();
     System.out.println("enter the number for prime_no ");
     int b = sc.nextInt();
    
     A1.fibonacci(a);
     A1.prime_no(b);
     
 }
}
 