package ex7_java_basics;

public class Lab002_FizzBuzz_Test {
    static void main() {
        for(int i = 1 ; i <= 100 ; i++){
            if(i%3 == 0){
                System.out.printf("Fizz%d\n", i);
            }
            if (i%5 == 0) {
                System.out.printf("Bus%d\n", i);
            }
            if (i%3 == 0 || i%5 == 0) {
                System.out.printf("FizzBuss%d\n", i);
            }
            else{
                System.out.println("none");
            }

        }
    }
}
