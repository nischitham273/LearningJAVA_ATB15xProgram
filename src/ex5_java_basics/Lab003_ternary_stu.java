package ex5_java_basics;

public class Lab003_ternary_stu {
    static void main(String[] args) {
        int marks = 58;
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);
        int a = 48;
        int b = 5;
        String even = (a%2 == 0) ? "a is even" : "a is odd";
        System.out.println(even);
        String odd = (b%2 == 0) ? "b is even" : "b is odd";
        System.out.println(odd);

    }
}
