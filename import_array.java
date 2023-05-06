import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;
public class import_array {
     static void array(int n)
        {   Scanner sc = new Scanner(System.in);
           
            int[] arr = new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0; i<n; i++)  
            {  
                arr[i]=sc.nextInt();  
            } 

            Arrays.sort(arr);

            for(int i =0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        
        array(n);     
        
    }
    
}
