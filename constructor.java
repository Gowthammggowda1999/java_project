public class constructor {

    String name  ;
    int id ;
    String branch ;

    constructor(int id ,String name,String branch){
        this.id = id;
        this.name = name;
        this.branch = branch;
 
     }
    constructor(constructor c){
        id =c.id;
        name = c.name;
        
 
     }

    public static void main(String[] args) {

       constructor c1 = new constructor(55,"prem","ece");
       constructor c2 = new constructor( c1);
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.branch);
        System.out.println(c2.id);
        System.out.println(c2.name);
        
    }
    
}
