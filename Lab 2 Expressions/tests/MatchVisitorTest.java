/**
 * Tests for MatchVisitor.
 * @author Tim
 * @version 1.0
 */
public class MatchVisitorTest extends AbstractQueryTest {

    /** Test simple Match. */
    public void testSimpleMatch() {
        MatchVisitor visitor = new MatchVisitor(9);
        getEq1().accept(visitor);
        assertTrue("MatchVisitor should have returned true for SimpleQuery",
                visitor.isMatch());

        visitor = new MatchVisitor(5);
        getEq1().accept(visitor);
        assertFalse("MatchVisitor should have returned false for SimpleQuery",
                visitor.isMatch());
    }

    /** Test and Match. */
    public void testAndMatch() {
        MatchVisitor visitor = new MatchVisitor(3);
        getAnd().accept(visitor);
        assertFalse("MatchVisitor should have returned false for AndQuery",
                visitor.isMatch());

        visitor = new MatchVisitor(7);
        getAnd().accept(visitor);
        assertFalse("MatchVisitor should have returned false for AndQuery",
                visitor.isMatch());

        visitor = new MatchVisitor(4);
        getAnd().accept(visitor);
        assertTrue("MatchVisitor should have returned true for AndQuery",
                visitor.isMatch());
    }

    /** Test intermediate Match. */
    public void testIntermediateMatch() {
    }

    /** Test complex Match. */
    public void testComplexMatch() {
    }
}
