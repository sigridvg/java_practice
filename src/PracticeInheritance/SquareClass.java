package PracticeInheritance;

public class SquareClass extends RectangleClass{

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }
}
