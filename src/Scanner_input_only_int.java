import java.util.Scanner;

public class Scanner_input_only_int {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean scannerGotInt = false;
        int n = 0; // max N
        do {
            System.out.println("Gib bitte eine positive Ganzzahl (größer als 1) ein:");
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n > 1) {
                    scannerGotInt = true;
                }
            } else {
                System.out.println("Falsche Eingabe!");
                scan.next();
            }
        }
        while (!scannerGotInt);
    }
}
