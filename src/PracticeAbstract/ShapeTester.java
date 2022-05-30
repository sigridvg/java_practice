package PracticeAbstract;

public class ShapeTester {
    public static void main(String arg[]){

        ShapeAbstractClass rectagle = new RectagleClass(5,9);
        rectagle.print();
        System.out.println(rectagle.calculateArea());
    }
}
