/**
 * BasicStudiesProgramme is a concrete subclass of Programme.
 * It represents a basic studies programme in the system.
 */
public class BasicStudiesProgramme extends Programme{

    /**
     * Constructor for BasicStudiesProgramme.
     *
     * @param name Name of the programme
     * @param id   Unique ID of the programme
     */
    public BasicStudiesProgramme(String name, String id) {
        super(name, id);
    }
    /**
     * Defines when two BasicStudiesProgramme objects are equal.
     *
     * Two objects are considered equal if their IDs are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BasicStudiesProgramme b){
            return this.getId().equals(b.getId());
        } else return false;
    }
}