import java.util.ArrayList;

/**
 * Abstract class representing a study activity.
 * A study activity can be a Course, Project, SubjectModule, etc.
 *
 * The class contains common properties shared by all study activities.
 */
public abstract class StudyActivity {
    private String name;
    private int ects;
    private String programme;

    /**
     * Constructor used when creating a StudyActivity.
     *
     * @param name Name of the activity
     * @param ects Number of ECTS points
     */
    public StudyActivity(String name, int ects, String programme) {
        this.name = name;
        this.ects = ects;
        this.programme = programme;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgramme() {
        return programme;
    }
//sets program
    public void setProgramme(String programme) {
        this.programme = programme;
    }
//returns ects values.
    public int getEcts() {
        return ects;
    }
//Sets ects value
    public void setEcts(int ects) {
        this.ects = ects;
    }

    /**
     * Returns a string representation of the object.
     * Used when printing the object.
     */
    public String toString(){
        return "Name: " + getName() + "\n ECTS: " + getEcts() + "\n Programme: " + getProgramme();
    }

}
