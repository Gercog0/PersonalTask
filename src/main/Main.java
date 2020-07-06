package main;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a language: ");
        System.out.println("[1] English\n" +
                "[2] Belorussian\n" +
                "[3] Default\n" +
                "[4] Exit\n");


        int choose = scanner.nextInt();
        String country = "";
        String language = "";
        while (true) {
            if (choose == 1) {
                country = "US";
                language = "EN";
            } else if (choose == 2) {
                country = "BY";
                language = "BE";
            } else if (choose == 4) {
                System.out.println("Goodbye, me dear...");
                break;
            }
                Locale currentLocale = new Locale(language, country);
                ResourceBundle bundle = ResourceBundle.getBundle("property.text", currentLocale);

                String firstString = bundle.getString("str1");
                System.out.println(firstString);
                String secondString = bundle.getString("str2");
                System.out.println(secondString);
                break;

        }

    }
}
