package Practice;

import java.util.Scanner;

public class PhraseResult {
    public static void main(String arg[]){
        /*Create a program that asks a user for a season of the year, then a whole number, then an adjective.
        And use the input to complete the sentence below. Output the result.*/

        //obtener la estacion del año
        System.out.println("Ingrese la estacion del año: ");
        Scanner scanner = new Scanner(System.in);
        String seasson = scanner.nextLine();

        //Obtener un adjetivo
        System.out.println("Ingrese un adjetivo: ");
        String adjective = scanner.nextLine();

        //Obtener un número
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();

        //Frase resultado
        System.out.println("En un dia "+adjective+ " de " +seasson+", Yo suelo beber un mínimo de "+number+" tazas de café.");
        scanner.close();
    }


}
