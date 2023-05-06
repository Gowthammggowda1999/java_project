
   public class rev {
    public static void main(String[] args) {
       
      int x = reverse(1234,0);
     System.out.println(x);
     }
      
      static int  reverse(int a,int result)
      {  
          if(a==0)
         {
          return result;  
         }
         result=10*result+(a%10);
         return reverse ((a/10),result); 
         
    
      }
          
}