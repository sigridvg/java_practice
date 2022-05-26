package PracticeRepetitionStructures;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String arg[]){
        System.out.println("Ingrese una palabra: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i<text.length(); i++){
            char letter = text.charAt(i);
            if(letter == 'a' || letter == 'A' ){
                    letterFound = true;
                    break;
            }
        }
        if(letterFound == true){
            System.out.println("Letra encontrada!! ");
        }else{
            System.out.println("Letra no encontrada :(");

        }
    }
}
