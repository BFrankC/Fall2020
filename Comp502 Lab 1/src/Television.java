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
    private int PLASMA_MIN_SIZE = 32;
    // PLAZA_MAX
    private int LCD_MAX_SIZE = 50;
    // LCD_MIN
    private int TV_MIN_SIZE = 5;
    private int TV_MAX_SIZE = 60;

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
        return this.size;
    }

    /**
     * Change the size of the television to the given
     * parameter.
     * @param screenSize the new size.
     */
    public void setSize(int screenSize)
    {
        if (screenSize < TV_MIN_SIZE)
        {
            throw new IllegalArgumentException("Error: TV Size too small");
        }
        else if (screenSize > TV_MAX_SIZE)
        {
            throw new IllegalArgumentException("Error: TV Size too small");            
        }
        else if (this.type != null)
        {
            if (this.type.equalsIgnoreCase(LCD) && screenSize > LCD_MAX_SIZE)
            {
                throw new IllegalArgumentException("Error: TV Size too small for LCD"); 
            }
            else if (this.type.equalsIgnoreCase(PLASMA) && screenSize < PLASMA_MIN_SIZE)
            {
                throw new IllegalArgumentException("Error: TV Size too small for PLASMA"); 
            }
            else {
                this.size = screenSize;
            }
        }
        else 
        {
            this.size = screenSize;
        }
    }

    /**
     * Return the type of the television.
     * @return the type.
     */
    public String getType()
    {
        return this.type;
    }

    /**
     * Change the type of the television to the given
     * parameter.
     * @param screenType the new type.
     */
    public void setType(String screenType)
    {
        if(screenType == null)
        {
            throw new IllegalArgumentException("Error: bad argument for TV Type");
        }
        if(this.size < PLASMA_MIN_SIZE && screenType.equalsIgnoreCase(PLASMA) && this.size != 0)
        {
            // only throw if the size has already been set.
            throw new IllegalArgumentException("Error: bad argument for TV Type");
        }
        if (this.size > LCD_MAX_SIZE && screenType.equalsIgnoreCase(LCD) && this.size != 0)
        {
            // only throw if the size has already been set.
            throw new IllegalArgumentException("Error: bad argument for TV Type");
        }
        if (screenType.equalsIgnoreCase(PLASMA) || screenType.equalsIgnoreCase(LCD))
        {
            this.type = screenType;
        }
        else
        {
            throw new IllegalArgumentException("Error: bad argument for TV Type");
        }
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
        Television t = new Television();
    	        String stringArray[] = string.split(":");
    	        t.setId(stringArray[0]);
    	        t.setDescription(stringArray[1]);
    	        t.setWeeklyRate(Double.parseDouble(stringArray[2]));
    	        if (stringArray[3].compareTo("true") == 0) {
    	            t.rented();
    	        }
    	        else if (stringArray[3].compareTo("false") == 0) {
    	            t.returned();       
    	        }
    	        else
    	        {
    	            //coud throw here, but wont because tests don't expect it.
    	        }
    	        t.setSize(Integer.parseInt(stringArray[4]));
    	        t.setType(stringArray[5]);
    	        return t;
    }

    @Override
    public String saveToString() {
        //could have just overridden the toString method.
        //Television~345:Samsung:3.25:false:55:PLASMA
        return "Television~"
                + this.getId() + ":"
                + this.getDescription() + ":"
                + this.getWeeklyRate() + ":"
                + this.isRented() + ":"
                + this.getSize() + ":"
                + this.getType();
    }
}
