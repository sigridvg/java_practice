package PracticeOperators;

/*
* To qualify for a loan, a person must make at least $30,00 and
* have been working at their current job for at least 2 years
* */

import java.util.Scanner;

public class LoanQualifierLogicalOperators {
    public static void main(String arg[]){
        //Inicializar variables
        int salarioMinimo = 30000;
        int AñosEmpleadosRequerido = 2;

        //Variables desconocidas
        System.out.println("Ingrese tu sueldo bruto: ");
        Scanner scanner = new Scanner(System.in);
        double sueldo = scanner.nextDouble();

        System.out.println("Años de trabajo: ");
        int AñosTrabajados = scanner.nextInt();

        scanner.close();

        //Estructura de decisión
        if(sueldo >= salarioMinimo && AñosTrabajados>= AñosEmpleadosRequerido){

                System.out.println("Genial!, se te otorgara un prestamo");
        }else{
            System.out.println("No cumples con el salario minimo requerido");
        }


    }
}
