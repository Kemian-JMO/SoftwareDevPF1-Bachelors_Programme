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

    /*
     * Constructor for ProjectGroup.
     *
     * @param project     The project the group belongs to
     * @param student     First student added to the group
     * @param name        Name of the group
     * @param supervisor  Assigned supervisor
     */
    public ProjectGroup(Project project, Student student, String name, Supervisor supervisor) {
        if (project == null || student == null || name == null || supervisor == null) {
            throw new IllegalArgumentException("The parameters cannot be null.");
        }
        this.project = project;
        if (project.hasStudent(student)) {
            this.students.add(student);
        }else throw new IllegalArgumentException("The student is not in the project.");
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

    /*
     * Defines when two ProjectGroup objects are equal.
     * Currently: two groups are equal if their names are equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof ProjectGroup pg){
            return this.name.equals(pg.name);
        } else return false;
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("The student cannot be null.");
        }
        if (this.project.hasStudent(student)) {
            this.students.add(student);
        } else {
            throw new IllegalArgumentException("The student is not in the project.");
        }

    }

    public boolean studentHaveProject(Student student){
        return this.project.hasStudent(student);
    }

    public boolean hasStudent(Student student) {
        return this.students.contains(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }
}
