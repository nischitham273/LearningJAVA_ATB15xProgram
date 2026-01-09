package ex9_java_basics;

public class Lab001_break_continue {
    static void main(String[] args)
    {
//        for(int i=0; i<10; i++){
//            System.out.println(i);
//            if(i == 5){
//                break;
//            }
//        }
//        System.out.println("end");
        for(int i=0; i<10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("end");
    }
}
