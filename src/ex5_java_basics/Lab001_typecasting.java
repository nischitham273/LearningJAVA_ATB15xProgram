package ex5_java_basics;

public class Lab001_typecasting {
    static void main(String[] args) {
        int course = 100;
        float GST = 35.45f;
        float total = (float) course + GST;
        System.out.println(course + GST);
        System.out.println(total);
        char name = 'A';
        int name_num = (int)name;
        System.out.println(name_num);
        int num1 = 452;
        char num2 = (char) num1;
        System.out.println(num2);

    }
}
