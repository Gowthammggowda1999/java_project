public class pass_value {
    public static void main(String[] args) {
        
        name("Dhinesh");
        num(16);
    }

     static void name(String a) {
        a = "prem";   //here (a) is not changing ,(its creating a new object in heap..)
        System.out.println(a);
     }

     static void num(int a) {
        a = 99;  //here (a) is not changing ,(its creating a new object in heap..)                        
        System.out.println(a);
    }
    
}
