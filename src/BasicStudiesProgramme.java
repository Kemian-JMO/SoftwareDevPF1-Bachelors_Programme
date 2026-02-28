public class BasicStudiesProgramme extends Programme{
    public BasicStudiesProgramme(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BasicStudiesProgramme b){
            return this.getId().equals(b.getId());
        } else return false;
    }
}