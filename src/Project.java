import java.util.ArrayList;

public class Project extends StudyActivity{
    private ArrayList<ProjectGroup> projectGroups;

    public Project(String name, int ects, String id) {
        super(name, ects, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Project p){
            return this.getId().equals(p.getId());
        }else return false;
    }

    public ArrayList<ProjectGroup> getProjectGroups() {
        return projectGroups;
    }

    public void addProjectGroup(ProjectGroup projectGroup) {
        this.projectGroups.add(projectGroup);
        projectGroup.setProject(this);
    }
}
