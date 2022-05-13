package Practice;
/*
* All salespeople are expected to make al least 10 sales each week.
* For those who do, they receive a congratulatory message.
* For those who don't, they are informed of how many sales they were short.
* */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String arg[]){
        //Inicializar variables
        int quota = 10;

        //Valores no conocidos
        System.out.println("Ingrese el número de ventas realizadas esta semana: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        scanner.close();

        //Estructura de decision
        if(sales >= quota){
            System.out.println("Felicidades, cumpliste con el objetivo semanal");
        }else{
            System.out.println("Tu venta fue de: "+sales+". No cumpliste con el objetivo semanal");
        }

    }
}
