package jam101.week05;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String schoolNumber;
    private String registerView;

    public Student(String pFirstName, String plastName, int pAge, String pSchoolNumber, String pRegisterView){
        firstName = pFirstName;
        lastName = plastName;
        age = pAge;
        schoolNumber = pSchoolNumber;
        registerView = pRegisterView;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getRegisterView() {
        return registerView;
    }

    public void setRegisterView(String registerView) {
        this.registerView = registerView;
    }
}
