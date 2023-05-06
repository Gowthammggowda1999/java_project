import java.util.Arrays;
import java.util.Scanner;

public class Right_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rotation");
        int rotation = sc.nextInt();
        int [] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int [] temp = new int[n];
        int k = 0;

        for(int i =rotation;i<n;i++)
        {
            temp[k]=arr[i];
            k++;
        }
        for(int i =0;i<rotation;i++)
        {
            temp[k]=arr[i];
            k++;
        }
        System.out.println(Arrays.toString(temp));
    }
    
}
