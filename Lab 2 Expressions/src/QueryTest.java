import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/**
 * Test queries.
 * @author Tim
 * @version 1.0
 */
public class QueryTest extends TestCase {
    /**
     * Test simple queries.
     */
    public void testSimpleQueries() {
        EQQuery eqq = new EQQuery(3);
        assertTrue("Hint: EQQuery.matches should return true", eqq.matches(3));
        assertFalse("Hint: EQQuery.matches should return false",
                eqq.matches(5));

        LTQuery ltq = new LTQuery(3);
        assertTrue("Hint: LTQuery.matches should return true", ltq.matches(2));
        assertFalse("Hint: LTQuery.matches should return false",
                ltq.matches(3));
        assertFalse("Hint: LTQuery.matches should return false",
                ltq.matches(4));

        GTQuery gtq = new GTQuery(3);
        assertTrue("Hint: GTQuery.matches should return true", gtq.matches(4));
        assertFalse("Hint: GTQuery.matches should return false",
                gtq.matches(3));
        assertFalse("Hint: GTQuery.matches should return false",
                gtq.matches(2));
    }

    /**
     * Test composite queries.
     */
    public void testCompositeQueries() {
        List<Boolean> values = new ArrayList<Boolean>();

        NotQuery not = new NotQuery();
        values.add(true);

        assertFalse("Hint: NotQuery.apply should return false",
                not.apply(values));
        values.set(0, false);
        assertTrue("Hint: NotQuery.apply should return true",
                not.apply(values));

        AndQuery and = new AndQuery();
        values.set(0, true);
        values.add(true);
        assertTrue("Hint: AndQuery.apply should return true",
                and.apply(values));

        values.set(0, false);
        assertFalse("Hint: AndQuery.apply should return false",
                and.apply(values));

        values.set(0, true);
        values.set(1, false);
        assertFalse("Hint: AndQuery.apply should return false",
                and.apply(values));

        values.set(0, false);
        values.set(0, false);
        assertFalse("Hint: AndQuery.apply should return false",
                and.apply(values));

        OrQuery orQuery = new OrQuery();
        values.set(0, true);
        values.set(1, true);
        assertTrue("Hint: OrQuery.apply should return true",
                orQuery.apply(values));

        values.set(0, false);
        assertTrue("Hint: OrQuery.apply should return true",
                orQuery.apply(values));

        values.set(0, true);
        values.set(1, false);
        assertTrue("Hint: OrQuery.apply should return true",
                orQuery.apply(values));

        values.set(0, false);
        values.set(0, false);
        assertFalse("Hint: OrQuery.apply should return false",
                orQuery.apply(values));
    }
}
