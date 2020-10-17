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
        return this.size;
    }

    /**
     * Change the size of the television to the given
     * parameter.
     * @param screenSize the new size.
     */
    public void setSize(int screenSize)
    {
        this.size = screenSize;
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
    public void setType(String screenType) throws Exception {
        if(screenType.equals(LCD)) {
        	this.setType(screenType);
        }
        else if(screenType.equals(PLASMA)) {
        	this.setType(screenType);
        }
        else {
        	throw new Exception("Invalid TV Type");
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
     * @throws Exception 
     */
    public static Television createFromString(String string) throws Exception {
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
    	        	throw new Exception("Invalid");
    	        }
    	        t.setSize(Integer.parseInt(stringArray[4]));
    	        t.setType(stringArray[5]);
    	        return t;
    	    }


    @Override
    public String saveToString() {
        return null;
    }
}
