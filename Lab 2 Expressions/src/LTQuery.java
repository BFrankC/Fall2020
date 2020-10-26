
/**
 * An lt query.
 * @author Tim
 * @version 1.0
 */
public class LTQuery extends SimpleQuery {

    /**
     * Creates an LTQuery.
     * @param val the compare value
     */
    public LTQuery(int val) {
        super(val);
    }

    /**
     * Returns the name.
     * @return the name
     */
    @Override
    public String getName() {
        return "lt";
    }

    /**
     * Returns the operator.
     * @return the operator
     */
    @Override
    public Operator getOperator() {
        return new Operator("<", false);
    }

    /**
     * Returns true if the query matches the value.
     * @param val the value
     * @return true if the query matches the value
     */
    @Override
    public boolean matches(int val) {
        return val < value;
    }

}
