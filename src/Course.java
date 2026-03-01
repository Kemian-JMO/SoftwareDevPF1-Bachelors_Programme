import java.util.Objects;
/**
 * Course is a concrete subclass of StudyActivity.
 * Represents a specific course in the system.
 */
public class Course extends StudyActivity{
    /**
     * Constructor for Course.
     *
     * @param name Name of the course
     * @param ects Number of ECTS points
     * @param id   Unique course ID
     */
    public Course(String name, int ects, String id) {
        super(name, ects, id);
    }
    /**
     * Defines when two Course objects are equal.
     *
     * Two Course objects are considered equal if their IDs are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course c){
            return Objects.equals(this.getId(), c.getId());
        } else return false;
    }
}
