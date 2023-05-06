
public class name 
{
    public static void main(String[] args) {
     //javamava();
     add_1();
    }
  static void javamava(){
     String str = "javamava";
    String s1="";
    String s2="";
    String s3="";

    for(int i = 0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      if (ch=='a') {
        s1=s1+ch;
        s1=s1.toUpperCase();
      }else if (ch=='v') {
        s2=s2+ch;
      }else
        s3=s3+ch;
    }

    System.out.println(s1+s2+s3);
  }
  static void add_1()
  {
    int n =1;
    while(n<=50){
      
      System.out.print(n+" ");
       n=n+(n+1);
      
    }
  }
  
}
