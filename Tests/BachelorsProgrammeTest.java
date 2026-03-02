import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BachelorsProgrammeTest {

    @org.junit.jupiter.api.Test
    void isCompleted() {
    }

    @Test
    void addSubjectModule_guardConditionIsAlwaysTrue_soItNeverAdds() {
        Student student = new Student("email@email.dk", "Lastname", "Firstname", "1", "address 1", "4000", "Roskilde");
        BachelorsProgramme bp = new BachelorsProgramme(student);

        // sanity: initially empty
        assertNull(bp.getProgrammes()[1]);
        assertNull(bp.getProgrammes()[2]);

        SubjectModule sm1 = new SubjectModule("SM1", "S1");
        SubjectModule sm2 = new SubjectModule("SM2", "S2");

        // These should be the only valid positions, but because the condition is always true,
        // the method returns early and never assigns.
        bp.addSubjectModule(sm1, 1);
        assertNull(bp.getProgrammes()[1], "Position 1 should still be null because the guard returns early (always true)");

        bp.addSubjectModule(sm2, 2);
        assertNull(bp.getProgrammes()[2], "Position 2 should still be null because the guard returns early (always true)");

        // Also invalid positions should not add either
        bp.addSubjectModule(new SubjectModule("SM0", "S0"), 0);
        assertNull(bp.getProgrammes()[0], "Index 0 should not be used for subject modules");

        bp.addSubjectModule(new SubjectModule("SM3", "S3"), 3); // would be out of bounds if it ever assigned
        assertNull(bp.getProgrammes()[1], "No assignment should have happened");
        assertNull(bp.getProgrammes()[2], "No assignment should have happened");
    }

    @org.junit.jupiter.api.Test
    void addBasicProgram() {
    }

    @org.junit.jupiter.api.Test
    void addSubjectModule() {
    }

    @org.junit.jupiter.api.Test
    void getStudent() {
    }

    @org.junit.jupiter.api.Test
    void setStudent() {
    }
}