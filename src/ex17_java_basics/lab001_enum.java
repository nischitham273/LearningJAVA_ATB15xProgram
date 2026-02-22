package ex17_java_basics;

public class lab001_enum {
    public static void main(String[] args){
        Day today = Day.Sat;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());
    }
}
