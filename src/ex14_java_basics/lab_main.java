package ex14_java_basics;

public class lab_main {
    public static void main(String[] args){
        son s = new son();
        abstract_father f = new son();
        s.loan20k();
        f.loan20k();
        f.loan10k();
        s.earned_money();
    }
}
