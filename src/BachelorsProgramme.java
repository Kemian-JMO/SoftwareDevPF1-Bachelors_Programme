import java.util.ArrayList;

public class BachelorsProgramme {
    private boolean isCompleted = false;
    private Programme[] programmes = new Programme[3];
    private Student student = null;
    private int ectsMax = 180;

    public BachelorsProgramme(Student student) {
        this.student = student;
    }

    public boolean isCompleted() {
        if (isCompleted) return true;
        int ectsAmount = 0;
        for (Programme programme : programmes) {
            ectsAmount += programme.getEtcs();
        }
        if (ectsAmount == ectsMax) {
            isCompleted = true;
            return true;
        } else {
            int i = ectsMax - ectsAmount;
            if (i == 35) {
                System.out.println("You are missing 35 ECTS!, you are probably missing a subject module.");
            } else if (i == 70) {
                System.out.println("You are missing 70 ECTS!, you are probably missing both of your subject modules.");
            } else if (i == 110) {
                System.out.println("You are missing 110 ECTS!, you are probably a basic studies program");
            } else if (i == 145) {
                System.out.println("You are missing 145 ECTS!, you are probably a basic studies program and a subject module");
            } else if (i == 180) {
                System.out.println("You are missing 180 ECTS!, you are probably a basic studies program and two subject modules");
            }
            return false;
        }
    }

    public void addBasicProgram(BasicStudiesProgramme basicStudiesProgramme){
        programmes[0] = basicStudiesProgramme;
    }

    public void addSubjectModule(SubjectModule subjectModule, int position){
        if (position != 1 || position != 2) {
            System.out.println("Invalid position!");
            return;
        }
        programmes[position] = subjectModule;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    

}
