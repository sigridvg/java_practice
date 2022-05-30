package PracticeInheritance;

public class InheritanceTester {
    public static void main(String arg[]){
        EmployeeClass employee = new EmployeeClass();

        //Overloading and Overriding methods
        RectangleClass rectangle = new RectangleClass();
        rectangle.print();

        SquareClass square = new SquareClass();
        square.print("Sigrid");
        square.print();

        //Chain inheritance
        MotherClass mom = new MotherClass();
        mom.setName("Maricel");

        System.out.println("El nombre de mi mama es: "+ mom.getName() + " y es: "+mom.getGender());
    }



}
