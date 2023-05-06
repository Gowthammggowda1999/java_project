public class duplicateschar {
    
        public static void main(String[] args) {
            String str = "banana";
            int count;
    
           
            char ch[] = str.toCharArray();
    
            System.out.println("Duplicate Characters in " + str);
            String s1="";
    
            for(int i = 0; i < ch.length; i++) {
                count = 1;
                for(int j = i+1; j < ch.length; j++) {
                    if(ch[i] == ch[j] && ch[i] != ' ') {
                        s1=s1+str.charAt(j);
                        count++;
                        ch[j] = '0';
                    }
                }
                if(count > 1 && ch[i] != '0')
                    System.out.println(ch[i]);

            }
            System.out.println();

      }
}   
    