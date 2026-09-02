package Tag15_AufgabenWiederholung;

public class Student {
    String name;
    int age;
    int matrikelnummer;
    double averageGrade;
    boolean isBestanden;
    public Student(String name, int age, int matrikelnummer, double averageGrade){
        this.name = name;
        this.age = age;
        this.matrikelnummer = matrikelnummer;
        this.averageGrade = averageGrade;
        this.isBestanden = hasPassed(averageGrade);
    }
    public Student(String name, int age, int matrikelnummer){
        this.name = name;
        this.age = age;
        this.matrikelnummer = matrikelnummer;
        this.averageGrade = 5.0;
        this.isBestanden = hasPassed(averageGrade);

    }
    public static void printInfo(Student student){
        System.out.println("Name: " + student.name);
        System.out.println("Alter: " + student.age);
        System.out.println("Matrikelnummer: " + student.matrikelnummer);
        System.out.println("Durchschnittsnote: " + student.averageGrade);
        System.out.println("Bestanden: " + student.isBestanden);
    }
    public static boolean hasPassed(double averageGrade){
        if (averageGrade <= 4.0){
            return true;
        }
        return false;

    }
}

