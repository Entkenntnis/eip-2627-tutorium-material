import java.util.Scanner;

public class T4_A3_ExistTEL {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zeichenfolge ein: ");
        String eingabe = scanner.nextLine();
        char[] zeichen = eingabe.toCharArray();
        if (existTEL(zeichen)) {
            System.out.println("Die Buchstaben 't', 'e' und 'l' kommen mindestens einmal vor.");
        } else {
            System.out.println("Die Buchstaben 't', 'e' und 'l' kommen nicht alle mindestens einmal vor.");
        }
        scanner.close();
    }

    public static boolean existTEL(char[] zeichen) {
        return existsT(zeichen) && existsE(zeichen) && existsL(zeichen);
    }

    public static boolean existsT(char[] zeichen) {
        for (int i = 0; i < zeichen.length; i++) {
            if (zeichen[i] == 't' || zeichen[i] == 'T') {
                return true;
            }
        }
        return false;
    }

    public static boolean existsE(char[] zeichen) {
        // TODO
    }

    public static boolean existsL(char[] zeichen) {
        // TODO
    }
}
