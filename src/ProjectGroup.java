import java.util.ArrayList;
/**
 * Represents a project group.
 * A project group belongs to a Project,
 * contains multiple Students,
 * and has one Supervisor.
 */
public class ProjectGroup {
    private Project project;
    private ArrayList<Student> students = new ArrayList<>();
    private String name;
    private Supervisor supervisor;

    /**
     * Constructor for ProjectGroup.
     *
     * @param project     The project the group belongs to
     * @param student     First student added to the group
     * @param name        Name of the group
     * @param supervisor  Assigned supervisor
     */
    public ProjectGroup(Project project, Student student, String name, Supervisor supervisor) {
        this.project = project;
        project.addProjectGroup(this);
        this.students.add(student);
        this.name = name;
        this.supervisor = supervisor;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String toString() {
        return name;
    }
    /**
     * Defines when two ProjectGroup objects are equal.
     * Currently: two groups are equal if their names are equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof ProjectGroup pg){
            return this.name.equals(pg.name);
        } else return false;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
