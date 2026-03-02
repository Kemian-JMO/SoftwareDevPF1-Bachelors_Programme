/**
 * SubjectModule is a concrete subclass of Programme.
 * It represents a specific module within an education programme.
 */
 public class SubjectModule extends Programme{
    /**
     * Constructor for SubjectModule.
     *
     * @param name Name of the subject module
     * @param id   Unique ID of the module
     */
    public SubjectModule(String name, String id) {
        super(name, id);
    }
    /**
     * Defines when two SubjectModule objects are equal.
     *
     * Two SubjectModules are considered equal if their IDs are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SubjectModule s){
            return this.getId().equals(s.getId());
        }else return false;
    }
}
