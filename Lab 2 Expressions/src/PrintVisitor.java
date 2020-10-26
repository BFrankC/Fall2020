/**
 * Visitor to print expressions.
 * @author Tim
 * @version 1.0
 */
public class PrintVisitor extends Visitor {
    private StringBuffer expr = new StringBuffer();

    /**
     * Pre-visits the query.
     * @param query the query
     */
    @Override
    public void preVisit(CompositeQuery query) {
    }

    /**
     * Visits the query.
     * @param query the query
     */
    @Override
    public void visit(CompositeQuery query) {
    }

    /**
     * Post-visits the query.
     * @param query the query
     */
    @Override
    public void postVisit(CompositeQuery query) {
    }

    /**
     * Visits the SimpleQuery.
     * @param query the query
     */
    @Override
    public void visit(SimpleQuery query) {
    }

    /**
     * Returns the expression.
     * @return the expression
     */
    public String getExpression() {
        return expr.toString();
    }
}
