import java.util.Stack;

/**
 * Checks whether a value matches a Query.
 * @author Tim
 * @version 1.0
 */
public class MatchVisitor extends Visitor {

    private Stack<Boolean> stack = new Stack<Boolean>();
    private int value;

    /**
     * Creates a MatchVisitor to match a certain value.
     * @param val the value
     */
    public MatchVisitor(int val) {
        super();
        this.value = val;
    }

    /**
     * Post-visits the query.
     * @param query the query
     */
    @Override
    public void postVisit(CompositeQuery query) {
        //  This Visitor will be similar to the ComputeVisitor
        //  we saw in class.  The main difference is that each
        //  query can have more than two operands
    }

    /**
     * Visits a SimpleQuery.
     * @param query the query
     */
    @Override
    public void visit(SimpleQuery query) {
    }

    /**
     * Returns true if the query matched.
     * @return true if the query matched
     */
    public boolean isMatch() {
        return stack.pop();
    }
}
