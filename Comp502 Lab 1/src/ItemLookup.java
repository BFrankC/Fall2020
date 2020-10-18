
/**
 * This class is a lookup that matches items that exactly match
 * a specified item, to be passed into the constructor when creating
 * the instance of the lookup.
 *
 * @author Franklin University
 * @version 2.0
 */
public class ItemLookup implements Lookup
{
    private Item theItem;

    /**
     * Constructor for objects of class IdLookup.
     * @param item the item to lookup.
     */
    public ItemLookup(Item item)
    {
        theItem = item;
    }

    /**
     * Indicates whether the item exactly matches the item
     * passed into the contructor.
     * @param item the item being checked for a match.
     * @return true if the item matches, otherwise
     * false.
     */
    @Override
    public boolean matches(Item item)
    {
        try
        {
            if (item == null && theItem == null)
            {
                return true;
            }
        // ^ is exclusive or.  it means only one is true.
            else if (item == null ^ theItem == null)
            {
                return false;
            }
            // So, they both have a value, do they match?
            return theItem.equals(item);
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
