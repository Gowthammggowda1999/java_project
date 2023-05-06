public class lipps {
    public static void main(String[] args) {
        String str1="hello";
        String str2="";
       // char ch = ' ';
        for(int i=0;i<str1.length();i++)
        {
          char  ch=str1.charAt(i);
            ch=(char)(ch+4);
            str2=str2+ch;
            

        }
        System.out.println(str2);
    }
    
    
}
