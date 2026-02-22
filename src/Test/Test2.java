package Test;
//Create student with name="Bob", rollNo=101, section="A"
public class Test2 {
    public static void main(String[] args){
        student S1 = new student("Bob",101, 'A');
    }
}

class student{
    public student(String name, int rollno, char section){
        System.out.println("Information od students");
        System.out.println("Student: "+ name + ", Roll number: " + rollno + ", Section: " + section);
    }
}
