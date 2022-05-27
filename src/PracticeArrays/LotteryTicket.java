package PracticeArrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGHT = 6;
    private static final int MAXTICKETNUMBER = 99;
    public static void main(String arg[]){
        int[] ticket=generateNumber();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumber() {
        int[] ticket = new int[LENGHT];
        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < LENGHT; i++) {
            do {
                randomNumber = random.nextInt(MAXTICKETNUMBER);
            }while (sequencialSearch(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
            return ticket;
    }

    /**
     * Does a SEQUENCIAL SEARCH on the array to find a value
     * @param array Array to search through
     * @param numberToSearch Value to search for
     * @return True if found, false if not
     */

    public static boolean sequencialSearch(int array[], int numberToSearch){
        //This is called enhanced loop.
        for (int value: array){
            if(value==numberToSearch){
                return true;
            }
        }
        return false;
    }

    public static boolean BinarySearch(int array[], int numberToSearch){
        //Array must be sorted first
        Arrays.sort(array);

        //Binary Search method arrays
        int index = Arrays.binarySearch(array, numberToSearch);
        if(index>=0){
            return true;
        }
        return false;
    }

    public  static void printTicket(int ticket[]){
        for (int i = 0; i<ticket.length; i++){
            System.out.print(ticket[i] + " || ");
        }
    }
}
