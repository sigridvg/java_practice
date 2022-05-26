package Practice;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String arg[]){
        System.out.println("Ingrese su resultado de los examenes: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        switch (grade){
            case "A":
                System.out.println("Excelente trabajo!!!! ");
                break;
            case "B":
                System.out.println("Maravilloso!!");
                break;
            case "C":
                System.out.println("Buen trabajo");
                break;
            case "D":
                System.out.println("Necesitas esforzarte mas! ");
                break;
            case "F":
                System.out.println("Oh no!! ");
                break;
            default:
                System.out.println("Ingrese otra nota!!");
                break;
        }

    }
}
