package Test;

public class Test3 {
    public static void main(String[] args){
        Employee E1 = new Employee(1,"John Doe", (long) 50000.0);
    }
}
class Employee{
//    Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
//     "id", "name", and "salary". Add getter and setter methods.
//    Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0
    private int id;
    private String name;
    private long salarry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalarry() {
        return salarry;
    }

    public void setSalarry(long salarry) {
        this.salarry = salarry;
    }

    Employee(int id, String name, long salarry){
        System.out.println("Employee information");
        System.out.println("Employee ID: "+id+", Employee Name: "+name+", Employee Salary: "+salarry);
    }
}
