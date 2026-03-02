import java.util.ArrayList;
/**
 * Represents a Bachelor's Programme for a specific student.
 *
 * A bachelor consists of:
 * - 1 BasicStudiesProgramme
 * - 2 SubjectModules
 *
 * Total required ECTS = 180
 */
public class BachelorsProgramme {
    private boolean isCompleted = false;
    private final Programme[] programmes = new Programme[3];
    private Student student;
    private final int ectsMax = 180;
    /**
     * Constructor.
     * Associates a student with the bachelor programme.
     */
    public BachelorsProgramme(Student student) {
        this.student = student;
    }

    public Programme[] getProgrammes() {
        return programmes;
    }

    /**
     *
     * Checks if the bachelor is completed.
     *
     * A bachelor is completed when total ECTS = 180.
     */
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
// print messages depending on situation


//this adds a basic studies programme to the array in 0th position of the array
    public void addBasicProgram(BasicStudiesProgramme basicStudiesProgramme){
        programmes[0] = basicStudiesProgramme;
        basicStudiesProgramme.assignStudent(student);
    }

    //this adds a subject module to the array in 1st or 2nd position of the array
    public void addSubjectModule(SubjectModule subjectModule, int position){
        if (position != 1 && position != 2) {
            System.out.println("Invalid position!");
            return;
        }
        programmes[position] = subjectModule;
        subjectModule.assignStudent(student);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
