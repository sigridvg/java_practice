package PracticeRepetitionStructures;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String arg[]){
        //inicializacion de variables
        int rango = 15;
        int horasMaximas = 40;

        //Obtener los datos
        System.out.println("Cuantas horas trabajaste esta semana?: ");
        Scanner scanner = new Scanner(System.in);
        double horasTrabajadas = scanner.nextDouble();

        while(horasTrabajadas>horasMaximas || horasMaximas<1){
            System.out.println("Valor invalido. Ingrese un valor entre 1 y 40.");
            horasTrabajadas = scanner.nextDouble();
        }

        scanner.close();

        //calculo del Pago neto
        double gross = rango * horasTrabajadas;
        System.out.println("Pago salarial neto: $"+gross);
    }
}
