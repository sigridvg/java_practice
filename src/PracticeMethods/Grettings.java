package PracticeMethods;

import java.util.Scanner;

public class Grettings {
    public static void main(String arg[]){
        System.out.println("Ingrese su nombre completo: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hola, "+name);

    }
}
