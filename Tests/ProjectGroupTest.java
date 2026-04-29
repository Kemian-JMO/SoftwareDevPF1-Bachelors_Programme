import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectGroupTest {
    Project project = new Project("Project", 15, "P1");

    Student s1 = new Student("1@email.dk", "Lastname", "Firstname", "1", "address 1", "4000", "Roskilde");
    Student s2 = new Student("2@email.dk", "Lastname", "Firstname", "2", "address 1", "4000", "Roskilde");


    // This test checks the group if it can be created, if the fields are empty when created, and whether all the students
    //has the project.
    @Test
    void projectGroupEmpty() {

        s1.addStudyActivity(project);
        ProjectGroup group = new ProjectGroup(project, s1, "Group A", "John Supervisor");

        assertFalse(group.getStudents().isEmpty());
    }

    @Test
    void hasTitle() {
        s1.addStudyActivity(project);

        ProjectGroup group = new ProjectGroup(project, s1, "Group A", "John Supervisor");
        assertNotNull(group.getName());

    }

    @Test
    void supervisorNotEmpty() {
        s1.addStudyActivity(project);
        ProjectGroup group = new ProjectGroup(project, s1, "Group A", "John Supervisor");

        assertNotNull(group.getSupervisor());

    }

    @Test
    void allSignedUp() {
        s1.addStudyActivity(project);
        s2.addStudyActivity(project);
        ProjectGroup group = new ProjectGroup(project, s1, "Group A", "John Supervisor");
        group.addStudent(s2);

        for (Student member : group.getStudents()) {
            assertTrue(member.hasActivity(project));
        }
    }

    @Test
    void noSignUp() {
        assertThrows(IllegalArgumentException.class, () ->  new ProjectGroup(project, s1, "Group A", "John Supervisor") );
    }


}