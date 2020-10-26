import java.util.ArrayList;
import java.util.List;

/**
 * Base class for composite queries.
 * @author Tim
 * @version 1.0
 */
public abstract class CompositeQuery implements Query {

    /**
     * The sub-queries.
     */
    protected List<Query> children = new ArrayList<Query>();

    /**
     * Adds a sub-query.
     * @param subQuery the sub-query
     */
    public void addQuery(Query subQuery) {
        children.add(subQuery);
    }

    /**
     * Returns the number of sub-queries.
     * @return the number of sub-queries
     */
    public int getNumChildren() {
        return children.size();
    }

    /**
     * Applies this query to the given values.
     * @param values the values
     * @return the result
     */
    public abstract boolean apply(List<Boolean> values);

    /**
     * Accepts a visitor.
     * @param visitor the visitor
     */
    @Override
    public void accept(Visitor visitor) {
        //  TODO: Accept the visitor
        //  We need to call the preVisit(), visit(), and postVisit() methods
        //  on this Query, and we also need to pass the Visitor to the
        //  accept() method of each child.  This needs to be done in the right
        //  order.
    }
}
