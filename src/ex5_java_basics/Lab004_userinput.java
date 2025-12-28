package ex5_java_basics;

public class Lab004_userinput {
    static void main(String[] args) {
        String age_str_input = args[0];
        System.out.println(age_str_input instanceof String);
        int age_input = Integer.parseInt(age_str_input);
        String result = (age_input < 18) ? "Minor" : (age_input <= 60 ? "Adult" : "Sr.Citizen");
        System.out.println(result);
    }
}
