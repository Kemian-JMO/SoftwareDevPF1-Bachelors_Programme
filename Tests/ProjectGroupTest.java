import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectGroupTest {

    // This test checks the group if it can be created, if the fields are empty when created, and whether all the students
    //has the project.
    @Test
    void simpleProjectGroupCreationRequirements() {
        Project project = new Project("Project", 15, "P1");

        Student s1 = new Student("1@email.dk", "Lastname", "Firstname", "1", "address 1", "4000", "Roskilde");
        Student s2 = new Student("2@email.dk", "Lastname", "Firstname", "2", "address 1", "4000", "Roskilde");

        Supervisor sup = new Supervisor(
                "sup@email.dk",
                "SupLast",
                "SupFirst",
                new String[]{"address 1", "4000", "Roskilde"},
                "S1"
        );

        project.addStudent(s1);
        project.addStudent(s2);

        ProjectGroup group = new ProjectGroup(project, s1, "Group A", sup);

        group.addStudent(s2);
        assertFalse(group.getStudents().isEmpty());
        assertNotNull(group.getName());
        assertFalse(group.getName().isBlank());
        assertNotNull(group.getSupervisor());
        for (Student member : group.getStudents()) {
            assertTrue(project.hasStudent(member));
        }
    }


    @Test
    void getProject() {
    }

    @Test
    void setProject() {
    }

    @Test
    void getStudents() {
    }

    @Test
    void setStudents() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getSupervisor() {
    }

    @Test
    void setSupervisor() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void addStudent() {
    }
}