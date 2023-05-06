import java.util.Scanner;
class Sum_of_given_no
{
 
  static void sum(int a )
   {
     int no = a;
     int sum =0;
     while(no!=0){
           int rem = no % 10;
           sum = sum + rem;
          no = no/10; 
     }
     System.out.println(sum);
    }
    
  
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
sum(a);
}
}
