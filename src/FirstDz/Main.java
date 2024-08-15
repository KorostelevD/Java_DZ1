package FirstDz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your last name, please: ");

        //Введення данних
        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.nextLine();

        System.out.println("Enter your first name, please:  ");
        String firstName = scanner.nextLine();
        System.err.print("Hello! ");
        System.out.println(firstName + " " + lastName);

    }
}
