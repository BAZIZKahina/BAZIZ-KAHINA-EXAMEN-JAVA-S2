import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fruit {

    // Variables de classe
    public static String Category = "Fruit";

    // Variables d'instance
    private String FruitName ;

    // Constructor

    public Fruit () {

    }


    public Fruit (String FruitName) {

    }

    public Fruit (int FruitQuantity) {

    }
    // List Of Names
    List<String> FruitNamesList = new ArrayList<String>() {{
        add("Banana");
        add("strawberry");
        add("Pear");
        add("Apple");
        add("Kiwi");


    }};



}
