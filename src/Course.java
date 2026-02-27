import java.util.Objects;

public class Course extends StudyActivity{
    public Course(String name, int ects, Programme programme, String id) {
        super(name, ects, programme, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course c){
            return Objects.equals(this.getId(), c.getId());
        } else return false;
    }
}
