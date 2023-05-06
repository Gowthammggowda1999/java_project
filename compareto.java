import java.util.Arrays;

class Employee implements Comparable{
    int age;
    int id;
    String name;
    Employee(int age,int id,String name)
    {   super();
        this.age=age;
        this.id=id;
        this.name=name;
    }
   public int compareTo(Object o)
    {
     Employee q = (Employee)o;
     return this.id-q.id;
    }
    public String toString()
    {
        return "Employee[age="+age+",id="+id+",name="+name+"]";
    }



    public static void main(String[] args) {
        Employee e = new Employee(50, 1, "rocky");
        Employee e2 = new Employee(45, 3, "Dboss");
        Employee e3 = new Employee(55, 2, "shivanna");
        Employee [] arr ={e,e2,e3};
        Arrays.sort(arr);
        for(Employee a:arr){
            System.out.println(a);
        }
    }
}

