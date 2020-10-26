/**
 * The visitor base class.
 * @author Tim
 * @version 1.0
 */
public class Visitor {
    /**
     * Called before visiting a query's children.
     * @param query the query
     */
    public void preVisit(CompositeQuery query) {
        //  Nothing here
    }

    /**
     * Called between visiting the query's children.
     * In the case of a query with more than two children,
     * this will be called multiple times.
     * @param query the query
     */
    public void visit(CompositeQuery query) {
        //  Nothing here
    }

    /**
     * Called after visiting a query's children.
     * @param query the query
     */
    public void postVisit(CompositeQuery query) {
        //  Nothing here
    }

    /**
     * Called to visit a SimpleQuery.
     * @param query the query
     */
    public void visit(SimpleQuery query) {
        //  Nothing here
    }
}
