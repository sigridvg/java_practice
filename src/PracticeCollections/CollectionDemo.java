package PracticeCollections;

import java.util.*;

public class CollectionDemo {
    public static void main(String arg[]){
        //setDemo();
        //listDemo();
        //queueDemo();
        //mapDemo();
    }


    public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon")
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

    }
    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);

    }
    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
    }
    public static void mapDemo(){
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("banana", 55);
        fruitCalories.put("lemon", 90);
        fruitCalories.put("orange", 195);
        fruitCalories.put("lemon", 90);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);
    }

}
