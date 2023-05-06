

public class string_occurance 
{
	public static void main(String[] args) {
		
  String str = "hello java how are you";
  String [] s1 = str.split(" ");
  
  String temp=s1[0];
  s1[0]=s1[s1.length-1];
  s1[s1.length-1]=temp;
  
  String x=s1[0];
  String y=s1[s1.length-1];
  String revs1="";
  String revs2="";
		  
  for(int i = x.length()-1;i>=0;i--)
  {
	 char ch = x.charAt(i); 
	 revs1=revs1+ch;
  }
  s1[0]=revs1;
  for(int i =y.length()-1;i>=0;i--)
  {
	 char ch = y.charAt(i);
	 revs2=revs2+ch;
  }
  s1[s1.length-1]=revs2;
  for(int i =0;i<s1.length;i++)
  {
	 System.out.print(s1[i]+" ");
  }
	
    
}
}
