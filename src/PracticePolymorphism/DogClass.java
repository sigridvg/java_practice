package PracticePolymorphism;

public class DogClass extends AnimalClass{
    @Override
    public void makeSound() {
        System.out.println("Wooof");
    }

    public  void fetch(){
        System.out.println("Buscar la pelota es muy divertido");
    }
}
