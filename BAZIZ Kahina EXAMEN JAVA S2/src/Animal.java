
interface Animal {

    public void getAnimalInfo();

    String getAnimalName();

    void setAnimalName(String AnimalName_Arg);

    public String AnimalSound ();

    public void Sleep();
}

class Rhino implements Animal {

    @Override
    public void getAnimalInfo() {

    }

    @Override
    public String getAnimalName() {
        return null;
    }

    @Override
    public void setAnimalName(String AnimalName_Arg) {

    }

    @Override
    public String AnimalSound() {
        return null;
    }

    @Override
    public void Sleep() {

    }
}

class Dog implements Animal {

    // Class Variable
    public static String AnimalType = "Dog";

    // Instance Variables
    String AnimalName;

    public Dog(String AnimalName) {
        this.AnimalName = AnimalName;

    }

    @Override
    public void getAnimalInfo() {
        // System.out.println("⭐ Please implement getAnimalInfo()");
        System.out.println("Dog name is: " + AnimalName);
    }

    @Override
    public String getAnimalName() {
        return AnimalName;
    }

    @Override
    public void setAnimalName(String AnimalName_Arg) {
        this.AnimalName = AnimalName_Arg;
    }

    @Override
    public String AnimalSound() {
        String DogSound = "Dog is barking";
        return DogSound;
    }

    @Override
    public void Sleep() {
        System.out.println("Dog is Sleeping...");
    }
}
