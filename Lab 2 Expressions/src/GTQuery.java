
/**
 * A gt query.
 * @author Tim
 * @version 1.0
 */
public class GTQuery extends SimpleQuery {

    /**
     * Creates a GTQuery.
     * @param val the compare value
     */
    public GTQuery(int val) {
        super(val);
    }

    /**
     * Returns the name.
     * @return the name
     */
    @Override
    public String getName() {
        return "gt";
    }

    /**
     * Returns the operator.
     * @return the operator
     */
    @Override
    public Operator getOperator() {
        return new Operator(">", false);
    }

    /**
     * Returns true if the query matches the value.
     * @param val the value
     * @return true if the query matches the value
     */
    @Override
    public boolean matches(int val) {
        return val > value;
    }

}
