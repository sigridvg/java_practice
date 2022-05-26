package Practice;

import java.util.Scanner;

public class TestResult {
    public static void main(String arg[]){
        //obtenemos el resultado de la prueba
        System.out.println("Ingrese la nota que obtuvo en su examen: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determinar el resultado
        char result;
        if(score<=60){
            result = 'F';
        }else if(score>60 && score<=70){
            result ='D';
        }else if(score>70 && score<=80){
            result ='C';
        }else if(score>80 && score<=90){
            result ='B';
        }else{
            result='A';
        }

        //Imprimir el resultado
        System.out.println("El resultado de tu prueba es: "+result);

    }
}
