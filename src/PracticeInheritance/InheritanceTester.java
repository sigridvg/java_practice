package PracticeInheritance;

public class InheritanceTester {
    public static void main(String arg[]){
        EmployeeClass employee = new EmployeeClass();

        RectangleClass rectangle = new RectangleClass();
        rectangle.print();

        SquareClass square = new SquareClass();
        square.print("Sigrid");
        square.print();
    }



}
