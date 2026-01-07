package ex08_java_basics;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Lab002_browser {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which browser you want to continue");
        String bowser = scanner.next();
        bowser = bowser.toLowerCase();
        switch (bowser){
            case "chrom":
                System.out.println("Continue with chrom browser");
                break;
            case "firefox":
                System.out.println("Continue with firefox");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
