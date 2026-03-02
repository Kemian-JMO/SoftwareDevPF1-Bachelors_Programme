import java.util.Arrays;

public class Student extends Person{
    private int studentNum;
    private BachelorsProgramme bachelorsProgramme;

    public Student(String email, String lastName, String firstName, String studentNum, String ... address) {
        super(email, lastName, firstName, address);
        this.studentNum = Integer.parseInt(studentNum);
    }

    public BachelorsProgramme getBachelorsProgramme() {
        return bachelorsProgramme;
    }

    public void setBachelorsProgramme(BachelorsProgramme bachelorsProgramme) {
        if (this.bachelorsProgramme == bachelorsProgramme) return;

        this.bachelorsProgramme = bachelorsProgramme;
        if (bachelorsProgramme != null && bachelorsProgramme.getStudent() != this) {
            bachelorsProgramme.setStudent(this);
        }
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "\nStudent Number: " + studentNum + "\nEmail: " + getEmail();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student s){
            return this.studentNum == s.studentNum;
        }else return false;
    }
}
