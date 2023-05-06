import java.util.Scanner;
public class pattrens {
    public static void main(String[] args) {

        // pattern(5);
        // pattern1to5(1);
        // pattern_odd(5);
        // pattern_9(5);
        // pattrenstar();
        // patternprime(5);
        // pattern_not_prime(5);
        // pattern_12();
        // pattern_19();
        //  pattern_26();
       // pattern_space(5);
         // pattern_p(5);
        // pattern_num();
        //pattern_w(5);
       // pattern_Y(5);
       Pattern();
    }
        
         static void pattern_19() 
         {
           for(int i =1;i<=5;i++) 
           {
            
            for(int j=1;j<=5;j++)
            {
                System.out.print((i+j)%2 + " ");
                
            }
               
            System.out.println();
           }
         }

         static void pattern_26() 
         {
           for(int i='A';i<='E';i++) 
           {
            
            for(char j='A';j<='E';j++)
            {
                System.out.print(i);
                
            }
               
            System.out.println();
           }
         }

            static void pattern_12()
       {  
            for (int i=1;i<=5;i++) 
            {
                int sum=i;

                for(int j=1;j<=5;j++)
                {
                    System.out.print(sum+" ");
                    sum=(sum+6)-1;
                } 
                System.out.println();
            } 
        }

        static void pattern (int n){
            int k =1;

            for (int row =1;row <= n;row++)
            {

                for (int col = 1;col <= n ; col++)
                {
                    System.out.print(k +" ");
                    k++;
                }
                System.out.println();
            }
        }

        static void pattern1to5(int n){

            for (int row =5;row >= n;row--)
            {

                for (int col = 1;col <= 5; col++)
                {
                    System.out.print(row+" ");
                }
                System.out.println();
            }
        }

        static void pattern_odd(int n){

            int odd =1;
            for (int row =1;row <= n;row++)
            {

                for (int col = 1;col <= n; col++)
                {
                    System.out.print(odd+" ");
                    odd=odd+2;
                }
                System.out.println();
            }
        }
       
        static void pattern_9(int n){
        
            int i = 1;
            
            for (int row =1;row <= n;row++)
            {

                for (int col = 1;col <= n; col++)
                {
                                     
                  
                    System.out.print(row*col+" ");
                    
                }
                System.out.println();
            }
        }
    
        static void pattrenstar(){
           int n = 5;
            Scanner sc = new Scanner(System.in);
          //  int n = sc.nextInt();
           
            for(int row = n;row >=1;row--){

                for (int col = 1; col < row; col++){
                    System.out.print("*" +" ");
                }
                System.out.println();
            }
                
            
        }

        static void patternprime(int n){
            int k =2;

            for (int row =1;row <= n;row++)
            {

                for (int col = 1;col <= n ; col++)
                {
                    System.out.print(k +" ");
                    k +=2 ;
                }
                System.out.println();
            }
        }

        static void pattern_not_prime(int n){
            int k =1;

            for (int row =1;row <= n;row++)
            {

                for (int col = 1;col <= n ; col++)
                {
                    System.out.print(k +" ");
                    k +=2 ;
                }
                System.out.println();
            }
        }
        

      static void pattern_space(int input)
      {

      for(int i = 1; i <= input; i++)
      {

        for(int j = 1; j <= 5; j++)
        {

          if(i==2||i==3||i==4)
          {
            if(j==2||j==3||j==4)
            {
              System.out.print("  ");
            }else{
              System.out.print("*"+" ");
            }
          }

          else{
          System.out.print("*"+" ");
          }
        }
         System.out.println();
      }

    }

    static void pattern_p(int no)
    {
        
        for(int i=(no+no)-1;i>=1;i--)
        { 
           if(i>=no)
           {
            for(int j=(no+no)-1;j>=i;j--)
            {
              System.out.print("*"+" ");
            }
           }else{
            for(int j=i;j>=1;j--)
            {
              System.out.print("*"+" ");
            }
           }
          System.out.println();
        }
    }
   static void pattern_num()
   {
    for(int i=5;i>=1;i--)
    { 
      
        for(int j=1;j<=9;j++)
        {
           if(j>=i)
           {
             System.out.print(i*j);
           } 
           else{
            System.out.print(0);
           }
        }
     
        System.out.println();
    }

   }
   static void pattern_w(int n)
   {
    for(int i=1;i<=n;i++)
    { 
      
        for(int j=1;j<=n;j++)
        {
           if(j==1||j==5||(i==n/2+1 && j==3)||(i==4 && j==2||i==4&&j==4))
           {
             System.out.print("W ");
           } 
           else{
            System.out.print("  ");
           }
        }
     
        System.out.println();
    }
    static void pattern_Y(int n)
   {
    for(int i=1;i<=n;i++)
    { 
      
        for(int j=1;j<=n;j++)
        {
           if(i+j==n+1||(i==1&&j==1)||(i==2&&j==2))
           {
             System.out.print("* ");
           } 
           else{
            System.out.print("  ");
           }
        }
     
        System.out.println();
    }
    static Void Pattern(){
       for(int i =5;i>=1;i--)
       {
        for(int j=i;j<=5;j++)
        {
            System.out.print(i);
        }
        System.out.println();
       }
    }

   }

}

    

        
