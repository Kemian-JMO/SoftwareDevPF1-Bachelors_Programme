public class Project extends StudyActivity{
    public Project(String name, int ects, String id) {
        super(name, ects, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Project p){
            return this.getId().equals(p.getId());
        }else return false;
    }
}
