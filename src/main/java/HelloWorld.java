import java.util.Scanner;

public class HelloWorld {
    private static final String EXIT = "exit";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String end = null;
        do {
            System.out.println("Wpisz '"+ EXIT + "', aby zakończyć program");
            end = input.nextLine().toLowerCase();
        } while (!end.equals(EXIT));
        input.close();
    }
}
