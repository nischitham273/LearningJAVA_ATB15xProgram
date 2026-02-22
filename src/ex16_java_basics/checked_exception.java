package ex16_java_basics;

public class checked_exception {
    public static void main() {
//        String s1 = null;
//        s1.trim(); // NullPointerException
        int a = 0;
        try {
            int b = 10/0; //ArithmeticException
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }


    }
}
