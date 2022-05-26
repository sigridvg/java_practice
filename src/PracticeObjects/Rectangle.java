package PracticeObjects;

public class Rectangle {
    static double length;
    static double width;

    double getLength(){
        return length;
    }

    void setLength(double length){
        this.length = length;
    }
    double getWidth(){
        return length;
    }

    void setWidth(double width){
        this.width = width;
    }


    public static double calculatePerimeter(){
        return (2*length)+ (2*width);
    }

    public static double calculateArea(){
        return length + width;
    }

    protected Rectangle(){
        length=0;
        width = 0;
    }
    protected Rectangle(double length, double width){
        setLength(length);
        this.length = length;

        setWidth(width); //Can be set this way
        this.width = width; //Or this way
    }


}
