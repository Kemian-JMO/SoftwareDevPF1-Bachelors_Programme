public class Project extends StudyActivity{
    public Project(String name, int ects, Programme programme, String id) {
        super(name, ects, programme, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Project p){
            return this.getId().equals(p.getId());
        }else return false;
    }
}
