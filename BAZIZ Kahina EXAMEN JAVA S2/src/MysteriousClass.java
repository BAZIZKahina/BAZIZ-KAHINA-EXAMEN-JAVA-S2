
/* * * * * * * * * * * * * * * * *
 *
 *
 *
 *     By Yoann AMAR ASSOULINE
 * * * * * * * * * * * * * * * * * */

import java.util.Scanner;
import java.io.IOException;

public class MysteriousClass {

    public static void main (String[] args) {

        System.out.println("Welcome to the Mysterious Class Adventure!");

        // University Students
        Students Student001 = new Student("Jack", "Master 2", 24, 98.7f);
        Students Student002 = new Student("Ramirez", "Master 1", 26, 87.47f);

        Students RandomStudent001 = new Student();
        Students RandomStudent002 = new Student();
        Students RandomStudent003 = new Student();
        Students RandomStudent004 = new Student();

        RandomStudent003.writeStudentInfo();

        // Students' Animals
        Dog MyNewDog = new Dog("Mylo");
        System.out.println(MyNewDog.AnimalSound());
        MyNewDog.Sleep();
        MyNewDog.getAnimalInfo();

        // Vehicles
        Vehicle Car01 = new Vehicle ();
        Vehicle Bike01 = new Vehicle (2);

        // Fruits
        Fruit Apple01 = new Fruit();

    }

    public void StartAdventure () {

    }


}