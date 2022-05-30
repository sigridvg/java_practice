package PracticePolymorphism;

public class CatClass extends AnimalClass{
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
    public  void scratch(){
        System.out.println("Soy un gato y araño todo");
    }
}
