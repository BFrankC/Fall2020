
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
        tvSize = size;
        tvType = type;
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
        try
        {
        // WE DONT KNOW THAT ITEM IS A TV!
            Television tv = (Television)item;
            if (tv == null)
            {
                //PROBLEM WITH CAST!
                return false;
            }
            if (tvSize == tv.getSize())
            {
    
                if (tv.getType() == null && tvType == null)
                {
                    return true;
                }
                return tvType.equalsIgnoreCase(tv.getType());
            }
            else 
            {
                return false;
            }
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
