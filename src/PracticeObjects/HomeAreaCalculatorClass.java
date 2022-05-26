package PracticeObjects;

public class HomeAreaCalculatorClass {
    public static void main(String arg[]){
        //Rectangle
        //Creamos una instancia de la clase rectangle
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double areaRoom2 = room2.calculateArea();

        double totalArea = areaRoom1 + areaRoom2;

        System.out.println("El area total de las habitaciones es: "+totalArea);


    }
}
