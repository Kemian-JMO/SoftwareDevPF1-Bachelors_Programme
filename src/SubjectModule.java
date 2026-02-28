public class SubjectModule extends Programme{
    public SubjectModule(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SubjectModule s){
            return this.getId().equals(s.getId());
        }else return false;
    }
}
