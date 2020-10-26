/**
 * Base class for simple queries.
 * 
 * @author Tim
 * @version 1.0
 */
public abstract class SimpleQuery implements Query {

    /** The value to compare to. */
    protected int value;

    /**
     * Creates a SimpleQuery.
     * 
     * @param val the value to be compared
     */
    public SimpleQuery(int val) {
        this.value = val;
    }

    /**
     * Returns the compare value.
     * 
     * @return the compare value
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns true if the query matches the value.
     * 
     * @param val the value
     * @return true if the query matches the value
     */
    public abstract boolean matches(int val);

    /**
     * Accepts a visitor.
     * @param visitor the visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
