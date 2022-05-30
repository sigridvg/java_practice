package PracticePolymorphism;

public class Zoo {
    public static void main(String arg[]){
        DogClass rocky = new DogClass();
        rocky.makeSound();
        rocky.fetch();
        feed(rocky);

        //Polymorphism
        AnimalClass sasha = new DogClass();
        sasha.makeSound();
        feed(sasha);

        sasha = new CatClass();
        sasha.makeSound();
        ((CatClass) sasha).scratch();

    }

    public static void feed(AnimalClass animal){
        if(animal instanceof DogClass){
            System.out.println("Le daremos comida de Perro");
        }else if(animal instanceof CatClass){
            System.out.println("Le daremos comida de gato");
        }
    }
}
