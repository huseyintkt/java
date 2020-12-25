package jam101.week05;

import java.util.ArrayList;
import java.util.Scanner;

public class School {

    private Scanner scanner = new Scanner(System.in);

    private ArrayList<Student> firstClass = new ArrayList<>();
    private ArrayList<Student> secondClass = new ArrayList<>();
    private ArrayList<Student> thirdClass = new ArrayList<>();
    private ArrayList<Student> fourthClass = new ArrayList<>();
    private ArrayList<Student> fifthClass = new ArrayList<>();

    /*
    * Bu metod, kullanicidan 10 ogrencinin bilgilerini alir.
    * Her ogrencinin okul numarasini ve kayit gorunumunu hesaplatir.
    * Ogrencinin yasina gore uygun sinifa yerlestirir.
    * Tum ogrenciler kayit edildikten sonra istenilen tum bilgileri console'a yazdirir.
    * */
    public void manager(){
        for(int i = 0; i < 2; i++){
            System.out.println((i+1) + ". öğrencinin bilgilerini giriniz :");
            System.out.println("Ad :");
            String firstName = scanner.next();
            System.out.println("Soyad :");
            String lastName = scanner.next();
            System.out.println("Yaş:");
            int age = scanner.nextInt();

            String schoolNumber = calculateSchoolNumber(firstName, lastName, age);
            String registerView = calculateRegisterView(schoolNumber, firstName, lastName);
            Student student = new Student(firstName, lastName, age, schoolNumber, registerView);
            addToClass(student);
        }
        printToConsole();
    }

    /*
    * Bu metod, ogrencinin okul numarasini hesaplayip geriye dondurur.
    * */
    private String calculateSchoolNumber(String pFirstName, String pLastName, int pAge){
        String schoolNumber = pFirstName.toUpperCase().substring(0,2)
                            + pLastName.toUpperCase().substring((pLastName.length()-3),pLastName.length())
                            + pAge;

        return schoolNumber;
    }

    /*
     * Bu metod, ogrencinin kayit gorunumunu hesaplayip geriye dondurur.
     * */
    private String calculateRegisterView(String pSchoolNumber, String pFirstName, String pLastName){
        pFirstName = pFirstName.substring(0, 1).toUpperCase() + pFirstName.substring(1);
        String registerView = pSchoolNumber
                            + " , "
                            + pFirstName
                            + " "
                            + pLastName.toUpperCase();

        return registerView;
    }

    /*
    * Bu metod, parametre olarak gonderilen ogrencinin yasina gore ilgili sinifa ekler.
    * */
    private void addToClass(Student pStudent){
        switch (pStudent.getAge()){
            case 6:
                firstClass.add(pStudent);
                break;
            case 7:
                secondClass.add(pStudent);
                break;
            case 8:
                thirdClass.add(pStudent);
                break;
            case 9:
                fourthClass.add(pStudent);
                break;
            case 10:
                fifthClass.add(pStudent);
                break;
        }
    }

    /*
    * Bu metod, siniflardaki ogrencilerin isim, soyisim ve kayıt gorunumlerini console'a yazdirir.
    * */
    private void printToConsole(){
        for(Student student : firstClass){
            System.out.println(
                    student.getFirstName()
                    + " "
                    + student.getLastName()
                    + " "
                    + student.getRegisterView()
                    + " "
                    + "1. Sınıf"
            );
        }

        for(Student student : secondClass){
            System.out.println(
                    student.getFirstName()
                    + " "
                    + student.getLastName()
                    + " "
                    + student.getRegisterView()
                    + " "
                    + "2. Sınıf"
            );
        }

        for(Student student : thirdClass){
            System.out.println(
                    student.getFirstName()
                    + " "
                    + student.getLastName()
                    + " "
                    + student.getRegisterView()
                    + " "
                    + "3. Sınıf"
            );
        }

        for(Student student : fourthClass){
            System.out.println(
                    student.getFirstName()
                    + " "
                    + student.getLastName()
                    + " "
                    + student.getRegisterView()
                    + " "
                    + "4. Sınıf"
            );
        }

        for(Student student : fifthClass){
            System.out.println(
                    student.getFirstName()
                    + " "
                    + student.getLastName()
                    + " "
                    + student.getRegisterView()
                    + " "
                    + "5. Sınıf"
            );
        }
    }
}