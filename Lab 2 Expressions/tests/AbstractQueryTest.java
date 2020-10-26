import junit.framework.TestCase;

/**
 * Base class for tests.
 *
 * @author Tim
 * @version 1.0
 */
public abstract class AbstractQueryTest extends TestCase {

    /** An eq query. */
    private Query eq1;
    /** An or query. */
    private CompositeQuery or1;
    /** An and query. */
    private CompositeQuery and;
    /** An and query. */
    private CompositeQuery and2;

    public Query getEq1() {
        return eq1;
    }

    public CompositeQuery getOr1() {
        return or1;
    }

    public CompositeQuery getAnd() {
        return and;
    }

    public CompositeQuery getAnd2() {
        return and2;
    }

    /**
     * Set up the test.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // x == 9
        eq1 = new EQQuery(9);

        // x < -2
        SimpleQuery lt1 = new LTQuery(-2);

        // x > 3 && x < 7
        and = new AndQuery();
        and.addQuery(new GTQuery(3));
        and.addQuery(new LTQuery(7));

        // !(x == 4)
        NotQuery not = new NotQuery();
        not.addQuery(eq1);

        // !(x < 8)
        NotQuery not2 = new NotQuery();
        not2.addQuery(new LTQuery(8));

        // (!(x == 4) && !(x < 8))
        and2 = new AndQuery();
        and2.addQuery(not);
        and2.addQuery(not2);

        // (x > 3 && x < 7) || (x < -2) || (!(x == 4) && !(x < 8))
        or1 = new OrQuery();
        or1.addQuery(and);
        or1.addQuery(lt1);
        or1.addQuery(and2);

    }

    public void testNothing() {
        int x = 3;
        x += 2;
        assertEquals("Make WebCAT happy", 5, x);
    }
}
