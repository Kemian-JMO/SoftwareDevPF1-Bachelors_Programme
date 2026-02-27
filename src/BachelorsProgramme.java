import java.util.ArrayList;

public class BachelorsProgramme {
    private boolean isCompleted = false;
    private ArrayList<StudyActivity> studyActivities = new ArrayList<>();
    private Student student = null;
    private int ects

    public BachelorsProgramme() {
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted() {
        int ectsAmount = 0;
        for (StudyActivity studyActivity : studyActivities) {
            ectsAmount += studyActivity.getEcts();
        }
        return ectsAmount ==
    }

    public ArrayList<StudyActivity> getStudyActivities() {
        return studyActivities;
    }

    public void setStudyActivities(ArrayList<StudyActivity> studyActivities) {
        this.studyActivities = studyActivities;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
