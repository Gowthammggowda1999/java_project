import java.util.Scanner;
public class if_condtion {
    
    static int ifs(int n){
        if (n>0) {
        System.out.println("the given number is postive");            
        }
        else{
            System.out.println("the given number is negative");
        }
        return(n);
    }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number ");
    int n = sc.nextInt();
    int num = ifs(n);
    System.out.println( num +" this is the number what u gave " );
    
 }
    
}
