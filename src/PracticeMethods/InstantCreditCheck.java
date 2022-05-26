package PracticeMethods;

import java.util.Scanner;

public class InstantCreditCheck {
    //Variables globales SCOPE: Globales
    static int RequiredSalary = 25000;
    static int requiredCreditScore=700;
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){
        //variables Locales. SCOPE: local
        //Obtenemos los valores desconocidos
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //Chequear si los usuarios son calificados
        boolean r = isUserQualified(salary, creditScore);

        //Notificar al usuario
        notifyUser(r);
    }

    public  static double getSalary(){
        System.out.println("Ingrese su salario: ");
        double salary = scanner.nextDouble();

        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Ingrese el monto que desea pedir: ");
        int creditScore = scanner.nextInt();

        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){
        if(creditScore>= requiredCreditScore && salary>=RequiredSalary){
            return true;
        }else{
            return false;
        }
    }

    public static void notifyUser(boolean result){
        if(result == true){
            System.out.println("Se le otorgara su prestamo!!!");
        }else{
            System.out.println("No podemos darle un prestamo!!! ");

        }
    }
}
