class recursion
{
	
    int numbers(int i, int  j)
       {
           if( j <= i)
           {
               System.out.print( j+" ");
               numbers(i,++ j);
           }
           return 0;
       }

}


public class printing_1to10_rec {
   
     public static void main(String [] args) 
       {
           int n =1;
           recursion obj = new recursion();
           System.out.print("Natural numbers till "+ n +" :");
           obj.numbers(10,n);
    
    
       }
      
   }
