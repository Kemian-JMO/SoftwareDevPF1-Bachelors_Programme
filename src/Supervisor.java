import java.util.Arrays;
/**
 * Supervisor class that extends Person.
 * Represents a supervisor in the system.
 */
public class Supervisor extends Person{
    private final String supervisorId;
    private String institutte;
    private String title;
    /**
     * Constructor for Supervisor.
     *
     * @param email        Supervisor's email
     * @param lastName     Supervisor's last name
     * @param firstName    Supervisor's first name
     * @param address      Supervisor's address (array of strings)
     * @param supervisorId Unique supervisor ID
     */
    public Supervisor(String email, String lastName, String firstName, String[] address, String supervisorId) {
        super(email, lastName, firstName, address);
        this.supervisorId = supervisorId;
    }
    /**
     * Returns a string representation of the supervisor.
     */
    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "\nSupervisor ID: " + supervisorId + "\nEmail: " + getEmail();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
