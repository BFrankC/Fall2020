/**
 * This class represents a television to be rented.
 *
 * @author Franklin University
 * @version 2.0
 */
public class Television extends AbstractItem
{
    private static final String PLASMA = "plasma";
    private static final String LCD = "lcd";

    private int size;
    private String type;

    /**
     * Constructor for objects of class Television.
     */
    public Television()
    {
        // No code needed.
    }

    /**
     * Return the size of the television.
     * @return the size.
     */
    public int getSize()
    {
        return 0;
    }

    /**
     * Change the size of the television to the given
     * parameter.
     * @param screenSize the new size.
     */
    public void setSize(int screenSize)
    {
    }

    /**
     * Return the type of the television.
     * @return the type.
     */
    public String getType()
    {
        return null;
    }

    /**
     * Change the type of the television to the given
     * parameter.
     * @param screenType the new type.
     */
    public void setType(String screenType)
    {
    }

    /**
     * Overrides equals() to compare Television objects.
     * @param o the object against which to compare.
     * @return true if the two objects are equal by value, otherwise false.
     */
    @Override
    public boolean equals(Object o)
    {
        if (!super.equals(o))
        {
            return false;
        }

        Television other = (Television) o;
        return size == other.size &&
                ABCRentals.nullSafeEquals(type, other.type);
    }

    /**
     * Creates a Television from a string in the format
     * id:desc:weeklyRate:rented
     * @param string The string
     * @return the new Television
     */
    public static Television createFromString(String string) {
        return null;
    }

    @Override
    public String saveToString() {
        return null;
    }
}
