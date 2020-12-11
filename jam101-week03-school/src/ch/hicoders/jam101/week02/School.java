package ch.hicoders.jam101.week02;
import ch.hicoders.jam101.week02.person.Student;
import java.util.ArrayList;
import java.util.Random;

public class School {

    public static void main(String[] args) {

        ArrayList<Student> studentList = School.generatorStudent();
        float mathAverage = School.mathAverage(studentList);
        float germanAverage = School.germanAverage(studentList);

        ArrayList<Student> studentsPassingMath = School.studentsPassingMath(mathAverage, studentList);
        ArrayList<Student> studentsNotPassingMath = School.studentsNotPassingMath(mathAverage, studentList);

        ArrayList<Student> studentsPassingGerman = School.studentsPassingGerman(germanAverage, studentList);
        ArrayList<Student> studentsNotPassingGerman = School.studentsNotPassingGerman(germanAverage, studentList);

        System.out.println("Tum Sinifin Matematik Ortalamasi : " + mathAverage);
        System.out.println("Tum Sinifin Almanca Ortalamasi : " + germanAverage);

        System.out.println("En Yuksek Matematik Puani Alan Ogrenci : " +
                School.highestMathScore(studentList).name + " " +
                School.highestMathScore(studentList).mathScore + " " +
                School.highestMathScore(studentList).germanScore
        );

        System.out.println("En Dusuk Matematik Puani Alan Ogrenci : " +
                School.lowestMathScore(studentList).name + " " +
                School.lowestMathScore(studentList).mathScore + " " +
                School.lowestMathScore(studentList).germanScore
        );

        System.out.println("En Yuksek Almanca Puani Alan Ogrenci : " +
                School.highestGermanScore(studentList).name + " " +
                School.highestGermanScore(studentList).mathScore + " " +
                School.highestGermanScore(studentList).germanScore
        );

        System.out.println("En Dusuk Almanca Puani Alan Ogrenci : " +
                School.lowestGermanScore(studentList).name + " " +
                School.lowestGermanScore(studentList).mathScore + " " +
                School.lowestGermanScore(studentList).germanScore
        );

        System.out.println("Tum Sinif Listesi :");
        for(Student student:studentList)
        {
            System.out.println(student.name + " " + "Matematik Puani : " + student.mathScore + " " + " Almanca Puani : " + student.germanScore);
        }

        System.out.println("Matematikten Gecenlerin Listesi :");
        for(Student student:studentsPassingMath)
        {
            System.out.println(student.name + " " + "Matematik Puani : " + student.mathScore + " " + " Almanca Puani : " + student.germanScore);
        }

        System.out.println("Matematikten Kalanlarin Listesi :");
        for(Student student:studentsNotPassingMath)
        {
            System.out.println(student.name + " " + "Matematik Puani : " + student.mathScore + " " + " Almanca Puani : " + student.germanScore);
        }

        System.out.println("Almancadan Gecenlerin Listesi :");
        for(Student student:studentsPassingGerman)
        {
            System.out.println(student.name + " " + "Matematik Puani : " + student.mathScore + " " + " Almanca Puani : " + student.germanScore);
        }

        System.out.println("Almancadan Kalanlarin Listesi :");
        for(Student student:studentsNotPassingGerman)
        {
            System.out.println(student.name + " " + "Matematik Puani : " + student.mathScore + " " + " Almanca Puani : " + student.germanScore);
        }
    }

    /*
     * Random sayida ogrenci uretip arrayList'e ekler.
     * Her ogrencinin matematik ve almanca puanlari da random uretilir.
     */
    public static ArrayList<Student> generatorStudent(){
        Random random = new Random();
        int numberOfStudents = random.nextInt(50);
        ArrayList<Student> studentList = new ArrayList<Student>();

        for(int i = 0; i <= numberOfStudents; i++){
            int mathScore = random.nextInt(6);
            int germanScore = random.nextInt(6);
            Student student = new Student(i + 1 + ". Ogrenci", mathScore, germanScore);
            studentList.add(student);
        }
        return studentList;
    }

    /*
    * Sinifin matematik ortalamasini hesaplar.
    */
    public static float mathAverage(ArrayList<Student> pStudentList){
        float total = 0;
        for(Student student:pStudentList){
            total = total + student.mathScore;
        }
        return total / pStudentList.size();
    }

    /*
     * Sinifin almanca ortalamasini hesaplar.
     */
    public static float germanAverage(ArrayList<Student> pStudentList){
        float total = 0;
        for(Student student:pStudentList){
            total = total + student.germanScore;
        }
        return total / pStudentList.size();
    }

    /*
    * Matemetikten gecen ogrencileri geri dondurur.
    */
    public static ArrayList<Student> studentsPassingMath(float pMathAverage, ArrayList<Student> pStudentList){
        ArrayList<Student> studentsPassingMath = new ArrayList<Student>();
        for(Student student:pStudentList)
        {
            if(student.mathScore >= pMathAverage){
                studentsPassingMath.add(student);
            }
        }
        return studentsPassingMath;
    }

    /*
     * Matemetikten kalan ogrencileri geri dondurur.
     */
    public static ArrayList<Student> studentsNotPassingMath(float pMathAverage, ArrayList<Student> pStudentList){
        ArrayList<Student> studentsNotPassingMath = new ArrayList<Student>();
        for(Student student:pStudentList)
        {
            if(student.mathScore < pMathAverage){
                studentsNotPassingMath.add(student);
            }
        }
        return studentsNotPassingMath;
    }

    /*
     * Almancadan gecen ogrencileri geri dondurur.
     */
    public static ArrayList<Student> studentsPassingGerman(float pGermanAverage, ArrayList<Student> pStudentList){
        ArrayList<Student> studentsPassingGerman = new ArrayList<Student>();
        for(Student student:pStudentList)
        {
            if(student.germanScore >= pGermanAverage){
                studentsPassingGerman.add(student);
            }
        }
        return studentsPassingGerman;
    }

    /*
     * Almancadan kalan ogrencileri geri dondurur.
     */
    public static ArrayList<Student> studentsNotPassingGerman(float pGermanAverage, ArrayList<Student> pStudentList){
        ArrayList<Student> studentsNotPassingGerman = new ArrayList<Student>();
        for(Student student:pStudentList)
        {
            if(student.germanScore < pGermanAverage){
                studentsNotPassingGerman.add(student);
            }
        }
        return studentsNotPassingGerman;
    }

    /*
    * En yuksek matematik puani alan ogrenciyi geri dondurur.
    */
    public static Student highestMathScore(ArrayList<Student> pStudentList){
        int highestMathScore = 0;
        Student studentHighestMathScore = null;

        for (Student student:pStudentList){
            if(student.mathScore > highestMathScore){
                highestMathScore = student.mathScore;
                studentHighestMathScore = student;
            }
        }
        return studentHighestMathScore;
    }

    /*
     * En dusuk matematik puani alan ogrenciyi geri dondurur.
     */
    public static Student lowestMathScore(ArrayList<Student> pStudentList){
        int lowestMathScore = 6;
        Student studentLowestMathScore = null;

        for (Student student:pStudentList){
            if(student.mathScore < lowestMathScore){
                lowestMathScore = student.mathScore;
                studentLowestMathScore = student;
            }
        }
        return studentLowestMathScore;
    }

    /*
     * En yuksek almanca puani alan ogrenciyi geri dondurur.
     */
    public static Student highestGermanScore(ArrayList<Student> pStudentList){
        int highestGermanScore = 0;
        Student studentHighestGermanScore = null;

        for (Student student:pStudentList){
            if(student.germanScore > highestGermanScore){
                highestGermanScore = student.germanScore;
                studentHighestGermanScore = student;
            }
        }
        return studentHighestGermanScore;
    }

    /*
     * En dusuk almanca puani alan ogrenciyi geri dondurur.
     */
    public static Student lowestGermanScore(ArrayList<Student> pStudentList){
        int lowestGermanScore = 6;
        Student studentLowestGermanScore = null;

        for (Student student:pStudentList){
            if(student.germanScore < lowestGermanScore){
                lowestGermanScore = student.germanScore;
                studentLowestGermanScore = student;
            }
        }
        return studentLowestGermanScore;
    }
}