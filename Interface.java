import java.util.Scanner;
import java.util.Arrays;
interface sample1
{
    void array(int n);
    void prime_no(int n);
    
}
interface demo1 extends sample1
{
    
    void string_rev(String c);
    void fibonacci(int d);
}
abstract class test1 implements demo1
{
     public void array(int n)
    {   
        Scanner sc = new Scanner(System.in);     
        int[] arr = new int[n];
        System.out.println("Enter the elements to sort: ");
        for(int i=0; i<n; i++)  
        {  
            arr[i]=sc.nextInt();  
        } 

        Arrays.sort(arr);

        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public void prime_no(int b)
    {
        for (int i=1;i<=b;i++)
        {
          boolean flag = true;
           for(int j=2;j<i;j++)
         {
            if(i%j==0)
            {
                flag=false;
                break;
            }
         }
         if(flag==true)
         {
            System.out.println(i+" is a prime number");
         }

        }
    }

}
     

class testing extends test1
{
   public void string_rev(String str)
    {
       String rev="";
       for(int i=str.length()-1;i>=0;i++)
       {
        rev=rev+str.charAt(i);
       }
       if(str.equals(rev)){
        System.out.println("Its a palindrome");
       }else{
        System.out.println("Its not a palindrome");
       }
       
    }
   public void fibonacci(int d)
   {
     int f1=0;
     int f2=1;
     int f3=0;
     System.out.println(f1+" "+f2);
     for(int i=1;i<=d;i++){
        f3=f1+f2;
        System.out.println(f3);
        f1=f2;
        f2=f3;
     }
   }
   void rev_number(int e)
   {
      int i = 0;
      int rev=0;
      while(e!=0){
        int rem = e%10;
        rev=(rev*10)+rem;
        e=e/10;
      }
      System.out.println(rev);
   }

}

 class Interface 
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    testing t1 = new testing();

    System.out.println("Enter the number of elements you want to store in array : ");
    t1.array(sc.nextInt());
    System.out.println("*************************************");
    
    System.out.println("Enter the length of prime_no ");
    t1.prime_no(sc.nextInt());
    System.out.println("*************************************");

    System.out.println("Enter the length of fibonacci no ");
    t1.fibonacci(sc.nextInt());
    System.out.println("*************************************");

    System.out.println("Enter the number for reverse ");
    t1.rev_number(sc.nextInt());
    System.out.println("*************************************");

    System.out.println("Enter the string ");
    t1.string_rev(sc.nextLine());
    System.out.println("*************************************");

  }    
}
