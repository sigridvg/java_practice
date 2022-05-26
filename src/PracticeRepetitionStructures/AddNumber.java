package PracticeRepetitionStructures;

import java.util.Scanner;

public class AddNumber {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("Ingrese el primer numero: ");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo numero: ");
            double num2 = scanner.nextDouble();

            double sum = num1+num2;
            System.out.println("Resultado: "+ sum);

            System.out.println("Quiere probar otra vez? (true/false)");
            again = scanner.nextBoolean();

        }while (again == true);
    }
}
