package PracticeRepetitionStructures;

import java.util.Scanner;

public class Cashier {
    public static void main(String arg[]){
        //Obtener el numero de items
        System.out.println("Ingrese el numero de items que desea escanear: ");
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();


        double total = 0;

        //Creamos un loop for
        for (int i = 0; i<items; i++){
            System.out.println("Ingrese el precio del item: ");
            double precio = scanner.nextDouble();

            total = total+precio;
        }
        scanner.close();
        System.out.println("Total: "+total);

    }

}
