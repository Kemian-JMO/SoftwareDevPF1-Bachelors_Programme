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

        s1.addStudyActivity(project);
        s2.addStudyActivity(project);

        ProjectGroup group = new ProjectGroup(project, s1, "Group A", "John Supervisor");

        group.addStudent(s2);
        assertFalse(group.getStudents().isEmpty());
        assertNotNull(group.getName());
        assertFalse(group.getName().isBlank());
        assertNotNull(group.getSupervisor());
        for (Student member : group.getStudents()) {
            assertTrue(member.hasActivity(project));
        }
    }


}