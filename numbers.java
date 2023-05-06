public class numbers {
    static void num(int n){
        if (n==0){
          return ;  
        }
        num(n-1);
        int ans =n;
        System.out.println(ans);
    }

    public static void main(String[] args) {
       num(5);
    }
}
