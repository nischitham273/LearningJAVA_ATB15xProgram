package ex17_java_basics;
import java.util.Collection;
public class Lab003 {
    public static void main(String[] args){
        System.out.println(color_code.Red.getCode_c());
    }
}
enum color_code {
    Red("1234"),
    Green("5678"),
    Blue("1011");

    private String code_c;
    color_code(String code_c){
        this.code_c = code_c;
    }
    String getCode_c(){
        return code_c;
    }

}