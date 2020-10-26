import java.util.List;

/**
 * An or query.
 * @author Tim
 * @version 1.0
 */
public class OrQuery extends CompositeQuery {

    /**
     * Returns the name.
     * @return the name
     */
    @Override
    public String getName() {
        return "or";
    }

    /**
     * Returns the operator.
     * @return the operator
     */
    @Override
    public Operator getOperator() {
        return new Operator("||", false);
    }

    /**
     * Applies the query to the list of values.
     * @param values the values
     * @return the result
     */
    @Override
    public boolean apply(List<Boolean> values) {
        for (Boolean b : values) {
            if (b) {
                return true;
            }
        }

        return false;
    }
}
