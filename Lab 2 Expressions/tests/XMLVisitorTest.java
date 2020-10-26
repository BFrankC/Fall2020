/**
 * Test for XMLVisitor.
 * @author Tim
 * @version 1.0
 */
public class XMLVisitorTest extends AbstractQueryTest {
    /** Test simple XML. */
    public void testSimpleXML() {
        XMLVisitor visitor = new XMLVisitor();
        getEq1().accept(visitor);

        assertEquals("SimpleQuery produced incorrect XML",
                "<eq value=\"9\"/>\n",
                visitor.getXML());
    }

    /** Test and XML. */
    public void testAndXML() {
        XMLVisitor visitor = new XMLVisitor();
        getAnd().accept(visitor);

        assertEquals("AndQuery produced incorrect XML",
                "<and>\n" +
                "  <gt value=\"3\"/>\n" +
                "  <lt value=\"7\"/>\n" +
                "</and>\n",
                visitor.getXML());
    }

    /** Test intermediate XML. */
    public void testIntermediateXML() {
        XMLVisitor visitor = new XMLVisitor();
        getAnd2().accept(visitor);
    }

    /** Test complex XML. */
    public void testComplexXML() {
        XMLVisitor visitor = new XMLVisitor();
        getOr1().accept(visitor);
    }
}
