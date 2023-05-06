class cool  
{
    void fool(){
        System.out.println("hello");
    }
    int y =10;

    
}
class sample extends cool
{
    void fo(){
        System.out.println("hi");
    }

}

public class type_casting {
    public static void main(String[] args) {
        cool c1 = new sample ();
        c1.fool();
        

        sample s1 = (sample)c1;
        s1.fo();
        //s1.fo();
        //System.out.println(s1.y);

        
    }     
    
}
