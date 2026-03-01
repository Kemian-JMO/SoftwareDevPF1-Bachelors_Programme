/**
 * Abstract class representing a study activity.
 * A study activity can be a Course, Project, SubjectModule, etc.
 *
 * The class contains common properties shared by all study activities.
 */
public abstract class StudyActivity {
    private String name;
    private int ects;
    private Programme programme;
    private String id;
    /**
     * Constructor used when creating a StudyActivity.
     *
     * @param name Name of the activity
     * @param ects Number of ECTS points
     * @param id   Unique ID
     */
    public StudyActivity(String name, int ects, String id) {
        this.name = name;
        this.ects = ects;
        this.id = id;
    }
//returns name
    public String getName() {
        return name;
    }
//stes name
    public void setName(String name) {
        this.name = name;
    }
// returns program
    public Programme getProgramme() {
        return programme;
    }
//sets program
    public void setProgramme(Programme programme) {
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
// return the used ID
    public String getId() {
        return id;
    }
//Sets unique ID
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Returns a string representation of the object.
     * Used when printing the object.
     */
    public String toString(){
        return "Name: " + getName() + "ID: " + getId() + "\n ECTS: " + getEcts() + "\n Programme: " + getProgramme();
    }
    /**
     * Abstract equals method.
     * Subclasses must define when two StudyActivity objects are equal.
     * For example: based on ID.
     */
    public abstract boolean equals(Object obj);


}
