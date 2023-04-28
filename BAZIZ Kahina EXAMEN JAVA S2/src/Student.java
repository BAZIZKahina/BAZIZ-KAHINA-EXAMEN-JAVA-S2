
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
 * Student Interface
 */
interface Students {

    public void getStudentInfo();

    public void writeStudentInfo();

}

/**
 * Class Student
 */
class Student implements Students {

    // Class Variables
    public static String StudentUniversity = "Golden University";
    public static int MaxCoursesNumber = 10;


    // Instance Variables
    String StudentName;
    String StudentMainClass;
    int StudentAge;
    String StudentAddress;
    float StudentPhoneNumber;
    float StudentGrades;
    boolean hasScholarship;
    String[] StudentOwnedCars;


    // Java Packages Objects
    Random random = new Random() ;



    // Constructors

    /**
     * Student Constructor (Random Generated mode) used to generate random students, based on random lists directly
     * inside the constructor itself.
     */
    public Student() {

        // List of names (before Java 5)
        List<String> StudentNamesList = new ArrayList<String>() {{
            add("Mark");
            add("Anais");
            add("Leo");
            add("Jonesy");
            add("Joelle");

        }};

        int StudentNamesList_Index = random.nextInt(StudentNamesList.size());

        // List of classes (Java 9+)
        List<String> StudentClassList = List.of("English", "Programming", "Math", "Physic",
                "Music", "Art", "French");


        this.StudentName = StudentNamesList.get(StudentNamesList_Index);
        this.StudentMainClass = StudentClassList.get(random.nextInt(StudentClassList.size()));
        this.StudentAge = random.nextInt(21,32);
        this.StudentGrades = random.nextFloat(60.0f,107.0f);

        this.getStudentInfo();
    }

    /**
     * Student Constructor (Custom Mode) to enter various information about each student, manually
     * @param StudentName
     * @param StudentMainClass
     * @param StudentAge
     * @param StudentGrades
     */
    public Student(String StudentName, String StudentMainClass, int StudentAge, float StudentGrades) {

        this.StudentName = StudentName;
        this.StudentMainClass = StudentMainClass;
        this.StudentAge = StudentAge;
        this.StudentGrades = StudentGrades;

    }

    /**
     * Method to print Student information to a console
     */
    @Override
    public void getStudentInfo() {

        Field[] StudentField = Student.class.getFields();

        System.out.println("\uD83C\uDF93 Student info \uD83C\uDF93");
        // Class Variables Information
        System.out.println("University: " + this.StudentUniversity);
        // Instance Variables Information
        System.out.println("Name: " + this.StudentName);
        System.out.println("Class: " + this.StudentMainClass);
        System.out.println("Age: " + this.StudentAge);
        System.out.println("Grades: " + this.StudentGrades);
        System.out.println("\uD83C\uDF00 Student info End \uD83C\uDF00 \n");
    }

    @Override
    public void writeStudentInfo() {


        try {

            File myStudentFile = new File("StudentData.txt");

            if (myStudentFile.createNewFile()) {
                System.out.println("File Created" + myStudentFile.getName());
            } else {
                System.out.println("File already exists");
            }

            // Writing Student information
            FileWriter myStudentFileWriter = new FileWriter (myStudentFile, true);
            myStudentFileWriter.write(this.StudentName);

            myStudentFileWriter.close();


        } catch (IOException e) {
            System.out.println ("Error occured");
            e.printStackTrace();
        }

    }

}

