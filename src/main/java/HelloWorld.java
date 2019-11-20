import java.util.Scanner;

public class HelloWorld {
    private static final String EXIT = "exit";
    public static void main(String[] args) {
        System.out.println("Witaj!");
        Scanner input = new Scanner(System.in);
        String end = null;
        do {
            System.out.println("Aby zakończyć program wpisz '"+ EXIT + "' i naciśnij Enter");
            end = input.nextLine().toLowerCase();
        } while (!end.equals(EXIT));
        input.close();
    }
}
