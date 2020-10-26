import java.util.List;

/**
 * A not query.
 * @author Tim
 * @version 1.0
 */
public class NotQuery extends CompositeQuery {

    /**
     * Returns the name.
     * @return the name
     */
    @Override
    public String getName() {
        return "not";
    }

    /**
     * Returns the operator.
     * @return the operator
     */
    @Override
    public Operator getOperator() {
        return new Operator("!", true);
    }

    /**
     * Applies the query to the list of values.
     * @param values the values
     * @return the result
     */
    @Override
    public boolean apply(List<Boolean> values) {
        return !values.get(0);
    }
}
