abstract class Person {
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    // all students have these semilarities

    public Person(String email, String lastName, String firstName, String address) {
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public abstract String toString();

    public abstract boolean equals(Object obj);
}
