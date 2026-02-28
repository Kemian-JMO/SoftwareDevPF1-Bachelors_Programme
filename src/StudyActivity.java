public abstract class StudyActivity {
    private String name;
    private int ects;
    private Programme programme;
    private String id;

    public StudyActivity(String name, int ects, String id) {
        this.name = name;
        this.ects = ects;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return "Name: " + getName() + "ID: " + getId() + "\n ECTS: " + getEcts() + "\n Programme: " + getProgramme();
    }
    public abstract boolean equals(Object obj);


}
