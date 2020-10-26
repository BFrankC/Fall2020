/**
 * The XMLVisitor.
 *
 * @author Tim
 * @version 1.0
 */
public class XMLVisitor extends Visitor {
    /** The XML we're building */
    private StringBuffer xml;
    /** Contains spaces representing the current level of indentation */
    private StringBuffer indent;

    /**
     * Creates an XMLVisitor.
     *
     */
    public XMLVisitor() {
        super();

        xml = new StringBuffer();
        indent = new StringBuffer();
    }

    /**
     * Returns the XML representation of the recipe.
     *
     * @return the XML representation of the recipe
     */
    public String getXML() {
        return xml.toString();
    }

    /**
     * Adds the current level of indentation to the XML
     */
    private void addIndentation() {
        xml.append(indent);
    }

    /**
     * Increases the level of indentation
     */
    private void increaseIndentation() {
        indent.append("  ");
    }

    /**
     * Decreases the level of indentation
     */
    private void decreaseIndentation() {
        indent.delete(indent.length() - 2, indent.length());
    }

    /**
     * Pre-visit the query.
     * @param query the query
     */
    @Override
    public void preVisit(CompositeQuery query) {
    }

    /**
     * Post-visit the query.
     * @param query the query
     */
    @Override
    public void postVisit(CompositeQuery query) {
    }

    /**
     * Visit a SimpleQuery.
     * @param query the query
     */
    @Override
    public void visit(SimpleQuery query) {
    }

}
