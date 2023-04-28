
// Java Standard Packages
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.lang.reflect.Field;


/**
 * professor Interface
 */
interface professor {

    public void getprofessorInfo();

    public void writeprofessortInfo();

}

/**
 * Class professor
 */
class professor implements professor {

    // Class Variables
    public static String professorUniversity = "Golden University";
    public static int Max = 10;


    // Instance Variables
    String professorName;
    String professorMainClass;
    int professorAge;
    String professorAddress;
    float professorPhoneNumber;
    float professorGrades;
    boolean hasScholarship;
    String[] professorOwnedCars;


    // Java Packages Objects
    Random random = new Random() ;



    // Constructors

    /**
     * professor Constructor (Random Generated mode) used to generate random professor, based on random lists directly
     * inside the constructor itself.
     */
    public professor() {

        // List of names (before Java 5)
        List<String> professorNamesList = new ArrayList<String>() {{
            add("Brad");
            add("Michel");
            add("Leo");
            add("Lars");
            add("sam");

        }};

        int professorNamesList_Index = random.nextInt(professorName.size() );

        // List of classes (Java 9+)
        List<String> professorClassList = List.of("English", "Programming", "Math", "Physic",
                "Music", "Art", "French");


        this.professorName = professorNamesList.get(professorNamesList_Index);
        this.professorMainClass = professorClassList.get(random.nextInt(professorClassList.size()));
        this.professorAge = random.nextInt(21,32);
        this.professorGrades = random.nextFloat(60.0f,107.0f);

        this.getprofessorInfo();
    }

    /**
     * professor Constructor (Custom Mode) to enter various information about each professor, manually
     * @param professorName
     * @param professorMainClass
     * @param professorAge
     * @param professorGrades
     */
    public professsor(String professorName, String professorMainClass, int professorAge, float professorGrades) {

        this.professorName = professorName;
        this.professorMainClass = professorMainClass;
        this.professorAge = professorAge;
        this.professorGrades = professorGrades;

    }

    /**
     * Method to print professor information to a console
     */
    @Override
    public void getprofessorInfo() {

        Field[] professsorField = professor.class.getFields();

        System.out.println("\uD83C\uDF93 professor info \uD83C\uDF93");
        // Class Variables Information
        System.out.println("University: " + this.professorUniversity);
        // Instance Variables Information
        System.out.println("Name: " + this.professorName);
        System.out.println("Class: " + this.professorMainClass);
        System.out.println("Age: " + this.professorAge);
        System.out.println("Grades: " + this.professorGrades);
        System.out.println("\uD83C\uDF00 professor info End \uD83C\uDF00 \n");
    }

    @Override
    public void writeStudentInfo() {


        try {

            File myprofessorFile = new File("professorData.txt");

            if (myprofessorFile.createNewFile()) {
                System.out.println("File Created" + myprofessorFile.getName());
            } else {
                System.out.println("File already exists");
            }

            // Writing professor information
            FileWriter myprofessorFileWriter = new FileWriter (myprofessorFile, true);
            myprofessorFileWriter.write(this.professorName);

            myprofessorFileWriter.close();


        } catch (IOException e) {
            System.out.println ("Error occured");
            e.printStackTrace();
        }

    }

}