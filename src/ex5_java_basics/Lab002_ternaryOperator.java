package ex5_java_basics;

public class Lab002_ternaryOperator {
    static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        String max = (n1 > n2) ? (n1 > n3 ? "n1 is greater" : "n3 is greater") : "n2 is greater";

        System.out.println(max);
    }
}
