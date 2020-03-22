package utilities;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    public static String enterString(String message) {
        System.out.print(message);
        return input.nextLine();
    }
}