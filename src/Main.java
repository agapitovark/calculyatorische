import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ScannerException {
        Scanner calc = new Scanner(System.in);
        String input = calc.nextLine();

        System.out.println(Calc.calc(input));
    }

}
