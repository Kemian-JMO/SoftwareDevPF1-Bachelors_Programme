import java.util.ArrayList;
import java.util.Arrays;

public class Student{
    private int studentNum;
    private String email;
    private String firstName;
    private String lastName;
    private String[] address;
    private final int maxects = 180;
    private int ects;
    private ArrayList<StudyActivity> activities  = new ArrayList<>();

    public Student(String email, String lastName, String firstName, String studentNum, String ... address) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new String[address.length];
        this.studentNum = Integer.parseInt(studentNum);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
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

    public void addStudyActivity(StudyActivity activity) {
        this.activities.add(activity);
    }

    public ArrayList<StudyActivity> getActivities() {
        return activities;
    }

    private int getEcts() {
        int ects = 0;
        for (StudyActivity activity : activities) {
            ects += activity.getEcts();
        }
        return ects;
    }

    public boolean hasCompleted() {
        return getEcts() >= maxects;
    }

    public boolean hasActivity(StudyActivity activity){
        return activities.contains(activity);
    }

}
