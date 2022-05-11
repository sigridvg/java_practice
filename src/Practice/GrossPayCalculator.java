package Practice;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        // Obtener el numero de horas trabajadas
        System.out.println("Ingrese el número de horas trabajadas: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Obtener el rango salarial del empleado
        System.out.println("Ingrese el rango salarial: ");
        double range = scanner.nextDouble();
        scanner.close();

        //Calculo de horas x rango salarial
        double grossPay = hours*range;

        //Mostrar el resultado
        System.out.println("El sueldo es: "+grossPay);


    }
}
