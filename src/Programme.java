import java.util.ArrayList;

public abstract class Programme {
    private String name;
    private String id;
    private String semester;
    private ArrayList<StudyActivity> studyActivities = new ArrayList<>();


    public Programme(String name, String id, String semester) {
        this.name = name;
        this.id = id;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String toString() {
        return "Name: " + getName()+"\nID: "+ getId() +"\nSemester: "+getSemester();
    }

    public abstract boolean equals(Object obj);
}
