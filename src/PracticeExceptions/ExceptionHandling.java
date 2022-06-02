package PracticeExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String arg[]){
        createNewFile();
    }

    public static void createNewFile() {
        File file = new File("ruta/prueba/archivo.txt");
        try {
            file.createNewFile();
        }catch (IOException e){// If we now the type of exceptions thats the program return
            System.out.println("Falle. Directorio no existente");
            e.printStackTrace();
        }


    }
    public static void createNewFile2() {
        File file = new File("ruta/prueba/archivo.txt");
        try {
            file.createNewFile();
        }catch (Exception e){// If we  don't now the type of exceptions thats the program return
            System.out.println("Falle. Directorio no existente");
            e.printStackTrace();
        }


    }

    public static void numbersExceptionHandling() {
        File file = new File("ruta/prueba/archivo.txt");
        Scanner FileReader = null;
        try {
            FileReader = new Scanner(file);
            while (FileReader.hasNext()){
                double number = FileReader.nextDouble();
                System.out.println(number);
            }
        }catch (FileNotFoundException | InputMismatchException  e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Falle.");
            e.printStackTrace();
        }finally {
            FileReader.close();
        }


    }
    public static void numbersExceptionHandling2() {
        File file = new File("ruta/prueba/archivo.txt");
        try(Scanner FileReader = new Scanner(file);) {
            while (FileReader.hasNext()){
                double number = FileReader.nextDouble();
                System.out.println(number);
            }
        }catch (FileNotFoundException | InputMismatchException  e){
            e.printStackTrace();
        }
    }

}
