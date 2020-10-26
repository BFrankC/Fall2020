/**
 * Tests for PrintVisitor.
 * @author Tim
 * @version 1.0
 */
public class PrintVisitorTest extends AbstractQueryTest {
    /** Test simple expr. */
    public void testSimplePrint() {
        PrintVisitor visitor = new PrintVisitor();
        getEq1().accept(visitor);

        assertEquals("SimpleQuery produced incorrect expression",
                "(x == 9)",
                visitor.getExpression());
    }

    /** Test and Print. */
    public void testAndPrint() {
        PrintVisitor visitor = new PrintVisitor();
        getAnd().accept(visitor);

        assertEquals("AndQuery produced incorrect expression",
                "((x > 3) && (x < 7))",
                visitor.getExpression());
    }

    /** Test intermediate Print. */
    public void testIntermediatePrint() {
        PrintVisitor visitor = new PrintVisitor();
        getAnd2().accept(visitor);
    }

    /** Test complex Print. */
    public void testComplexPrint() {
        PrintVisitor visitor = new PrintVisitor();
        getOr1().accept(visitor);
    }
}
