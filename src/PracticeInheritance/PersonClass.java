package PracticeInheritance;

public class PersonClass {
    private String name;
    private int age;
    private String gender;

    public PersonClass(){
        System.out.println("Esto es un constructor de persona por default");
    }

    public PersonClass(String name){
        System.out.println("El nombre de la persona es: "+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
