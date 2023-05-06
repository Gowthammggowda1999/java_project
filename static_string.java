
class student{
  int rollno;
  String name;
 static String college = "vysya";

student(int r,String n){
  rollno = r;
  name = n;
}

void display(){
  System.out.println(rollno+ " " + name + " " + college);
}
}


public class static_string {
  public static void main(String[] args) {
 
    student s1 = new student(21,"dhinesh");
    student s2 = new student(32,"vignesh");

    s1.display();
    s2.display();
  } 

}
