import java.util.Scanner;

class Main_string {
	public static void main(String []args) {

	Scanner sc = new Scanner(System.in);
	Input I1 = new Input();
	String x = sc.nextLine();
	String y = I1.text(x);
    
	System.out.println(y);
	  }

}
class Input
{
	static  String text(String a)
	{
		String x = a ;
		String rev = "";
	  for(int i = x.length()-1;i>=0;i--)
	  { 
		  rev= rev + x.charAt(i);
	  }
	  if(x.equals(rev))
	  {
		  return "Its a palindrome";
	  }
	  else 
	  {
		  return ("Its not a palindrome");
	  }
	  
	  
	}
}

