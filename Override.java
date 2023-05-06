class Override
{
    public static void main(String[] args) {
        sub o2 = sub.getpwd();
        System.out.println(o2.pwd);

        // sub o3 =  new sub();
        // System.out.println(o3.pwd);
          
    }
}
    class sub
 {
    private int pwd = 1234;
    static sub o1 = null;
    static sub getpwd()
    {
      if(o1==null)
      o1=new sub();
      return o1;
    }
   public void setpwd(int pwd)
   {
    this.pwd=pwd;
   }

 }

