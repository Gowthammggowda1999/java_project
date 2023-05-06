import java.util.Arrays;
class confusionprob1 {
    public static void main(String[] args) {
     int[] arr = {127,101,167,137,177,108,251};
     Arrays.sort(arr);  //101,108,127,137,167,177,251
     
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = true;

            for(int j=2;j<arr[i];j++)
            { 
                if(arr[i]%j==0)
                {
                    flag=false;
                    break;
                }
            }
        
            if(flag==true)
            {  
                
                int sum = 0;
                long fact=1;
                int no = arr[i];
                while (no!=0) {
                int rem= no%10;
                sum=sum+rem;
                no=no/10;   
                }
                for(int k = sum;k>=1;k--)
                {
                    fact = fact*k;
                }
                
                System.out.println(arr[i]+" is  prime number so factorial of prime no number is "+ fact);

        }else{
            
            int mul =1;
           
            int num=arr[i];
            while(num!=0)
            {
                int remain = num%10;
                mul=mul*remain;
                num=num/10;
                }
            

            System.out.println(arr[i]+" is not prime number so  multiplication for not prime no is "+ mul);
        }

      }
     
  
    }   
}

