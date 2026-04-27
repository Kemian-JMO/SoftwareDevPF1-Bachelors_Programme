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
     */
    public Course(String name, int ects, String programme) {
        super(name, ects, programme);
    }

}
