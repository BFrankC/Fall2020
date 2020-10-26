/**
 * The Visitable interface.
 * 
 * @author Tim
 * @version 1.0
 */
public interface Visitable {
    /**
     * Accept the visitor.
     * 
     * @param visitor the visitor
     */
    void accept(Visitor visitor);
}
