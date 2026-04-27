import java.util.ArrayList;

public class Project extends StudyActivity{
    private ArrayList<ProjectGroup> projectGroups;

    public Project(String name, int ects, String programme) {
        super(name, ects, programme);
    }


    public ArrayList<ProjectGroup> getProjectGroups() {
        return projectGroups;
    }

    public void addProjectGroup(ProjectGroup projectGroup) {
        this.projectGroups.add(projectGroup);
        projectGroup.setProject(this);
    }
}
