package PracticeObjects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){
        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();

       double rectanglesHouse = calculateRectangles(kitchen, bathroom);

        System.out.println("El area total de las habitaciones es: "+rectanglesHouse);

        scanner.close();
    }

    public static Rectangle getRoom(){
        System.out.println("Ingrese el largo de la habitacion: ");
        double lenght = scanner.nextDouble();

        System.out.println("Ingrese el ancho de la habitacion: ");
        double width = scanner.nextDouble();

        return new Rectangle(lenght, width);
    }
    public static double calculateRectangles(Rectangle rect1, Rectangle rec2){
       return  rect1.calculateArea() + rec2.calculateArea();
    }

}
