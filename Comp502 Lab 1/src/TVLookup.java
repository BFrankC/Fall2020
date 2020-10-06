/**
 * This class is a lookup that matches Television items whose size and type
 * match a specified item, to be passed into the constructor when creating
 * the instance of the lookup.
 *
 * @author Franklin University
 * @version 2.0
 */
public class TVLookup implements Lookup
{
    private int tvSize;
    private String tvType;

    /**
     * Constructor for objects of class IdLookup.
     * @param size the size of the television to lookup.
     * @param type the type of the teleivision to lookup.
     */
    public TVLookup(int size, String type)
    {
    }

    /**
     * Indicates whether the item matches the size and type
     * passed into the contructor.
     * @param item the item being checked for a match.
     * @return true if the size and type match, otherwise
     * false. Note that case should be ignored when matching
     * the type.
     */
    @Override
    public boolean matches(Item item)
    {
        return false;
    }
}
