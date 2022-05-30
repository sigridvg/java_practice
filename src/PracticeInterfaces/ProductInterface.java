package PracticeInterfaces;

public interface ProductInterface {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarCode(){
        return "Not barcode";
    }
}
