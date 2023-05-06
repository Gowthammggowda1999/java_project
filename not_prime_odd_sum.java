import java.util.Scanner;

class not_prime_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
       int sum=0;
       int not =0;
       for(int i=1;i<=no;i++)
       {
         boolean flag = false;
          for (int j = 2; j<i; j++)
          {
            if (i%j==0) 
            {
              not=i;
              flag = true;
              break;
            }
          }
          
             if (not%2!=0) 
            {
              sum=sum+i;  
            }
           
       }
       System.out.println(sum);
    }

    
}
