import java.util.Arrays;

public class Supervisor extends Person{
    private final String supervisorId;
    private String intitutte;
    private String title;

    public Supervisor(String email, String lastName, String firstName, String[] address, String supervisorId) {
        super(email, lastName, firstName, address);
        this.supervisorId = supervisorId;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "\nSupervisor ID: " + supervisorId + "\nEmail: " + getEmail();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
