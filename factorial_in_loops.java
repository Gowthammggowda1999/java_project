import java.util.Scanner;
public class factorial_in_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int fact = 1;
        System.out.println("Enter the number");
        n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    
}
