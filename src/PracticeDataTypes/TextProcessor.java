package PracticeDataTypes;

import java.security.SignatureSpi;

public class TextProcessor {
    public static void main(String arg[]){
        countWord("Yo amo Java");
        reverseString("Hola mundo");
        addSpace("HolaPruebaStringAddSpace");
    }
    /**
     *  Splits a String into an array by tokenizing it.
     * @param text Full string to be split
     */
    public static void countWord(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String messaje = String.format("El número de letras es %d", numberOfWords);
        System.out.println(messaje);

    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */

    public static void reverseString(String text){
        for (int i = text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    /**
     *Add space before every capital letter.
     * @param text Jumbled text
     */
    public static void addSpace(String text){
        var modifiedText = new StringBuilder(text);

        for (int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
