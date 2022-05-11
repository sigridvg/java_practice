package Practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String arg[]){
        //Valores conocidos
        int salary = 1000;
        int bonus = 250;

        //Valores Desconocidos
        System.out.println("Cuantas ventas realizo el empleado esta semana?: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Desvio rapido para los bonos de los beneficiarios
        if(sales>=10){
            salary +=bonus;
        }

        //Salida
        System.out.println("El empleado recibirá: $"+salary);
    }
}
