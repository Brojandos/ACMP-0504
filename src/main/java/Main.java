import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        switch (new Scanner(System.in).nextInt() % 3) {
            case 1: System.out.println("VGC"); break;
            case 2: System.out.println("CVG"); break;
            default: System.out.println("GCV"); break;
        }
    }
}