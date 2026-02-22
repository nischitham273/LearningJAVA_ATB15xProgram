package Test;

public class Tes1 {
    public static void main(String[] args){
//        Name: John, Age: 25 Name: Alice, Age: 30
        person p1 = new person("John",25);
        person p2 = new person("Alice",30);
    }
}
class person{
//    String name;
//    int age
    public person(String name, int age) {
        System.out.println("Name:" + name + ", Age:" + age);
    }
}
