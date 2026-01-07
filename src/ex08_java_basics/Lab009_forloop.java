package ex08_java_basics;

public class Lab009_forloop {
    static void main() {
        for(int i =1; i<=50; i++){
            if( (i%2) == 0){
                System.out.printf("even num %d\n", i);
            }
            else{
                System.out.printf("odd num %d\n", i);
            }
        }
    }
}
