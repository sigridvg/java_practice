package PracticeInheritance;

public class SquareClass extends RectangleClass{

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void print(String name){
        System.out.println("Prueba overloading metodos. Nombre: "+name);
    }
}
