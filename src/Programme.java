import java.util.ArrayList;

public abstract class Programme {
    private String name;
    private String id;
    private ArrayList<StudyActivity> studyActivities = new ArrayList<>();


    public Programme(String name, String id) {
        this.name = name;
        this.id = id;
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

    public String toString() {
        return "Name: " + getName()+"\nID: "+ getId();
    }

    public abstract boolean equals(Object obj);

    public ArrayList<StudyActivity> getStudyActivities() {
        return studyActivities;
    }

    public void addStudyActivities(StudyActivity studyActivities) {
        this.studyActivities.add(studyActivities);
        studyActivities.setProgramme(this);
    }

    public int getEtcs(){
        int ects = 0;
        for (StudyActivity studyActivity : studyActivities) {
            ects += studyActivity.getEcts();
        }
        return ects;
    }
}
