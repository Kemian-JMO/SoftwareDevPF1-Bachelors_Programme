/**
 * Abstract base class representing a Person.
 *
 * This class contains the common properties shared by all persons
 * in the system (e.g., Student, Supervisor).
 */
abstract class Person {
    private String email;
    private String firstName;
    private String lastName;
    private final String[] address;
    // all students have these semilarities
    /**
     * Constructor for Person.
     *
     * Uses defensive copying to protect internal address array.
     */
    public Person(String email, String lastName, String firstName, String[] address) {
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new String[address.length];
        System.arraycopy(address, 0, this.address, 0, address.length);
    }

    /**
     * Returns the address array.
     * NOTE: This returns the internal array directly,
     * which can break encapsulation.
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        System.arraycopy(address, 0, this.address, 0, address.length);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Abstract toString method.
     * Subclasses must define how the object is printed.
     */
    public abstract String toString();
    /**
     * Abstract equals method.
     * Subclasses must define when two Person objects are equal.
     */
    public abstract boolean equals(Object obj);
}
