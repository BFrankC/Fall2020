
/**
 * This class represents a furniture item for rent.
 *
 * @author Franklin University
 * @version 2.0
 */
public class Furniture extends AbstractItem
{
    private double monthlyRate;

    /**
     * Constructor for objects of class Furniture.
     */
    public Furniture()
    {
        // No code needed
    }

   /**
     * Return the monthly rental rate for the furniture
     * item.
     * @return the rate.
     */
    public double getMonthlyRate()
    {
        return this.monthlyRate;
    }

    /**
     * Change the monthly rental rate of the furniture item
     * to the given parameter.
     * @param mnthlyRate the new weekly rate.
     */
    public void setMonthlyRate(double mnthlyRate)
    {
        this.monthlyRate = mnthlyRate;
    }

    /**
     * Calculate the fees for renting the furniture for a given
     * number of weeks. If the number of weeks is 4 or more, the
     * monthly rate is charged for each 4 week period. For example, if
     * the furniture item is rented for 6 weeks, the rental fee will
     * be the monthly fee plus 2 X the weekly fee. Both the weekly
     * rate and the monthly rate must be set and the number of rental
     * weeks must be valid in order for the fee to be calculated.
     * @param weeks the number of rental weeks
     * @return the fee or null if the fee could not be calculated
     */
    @Override
    public double calculateFee(int weeks)
    {
        if (monthlyRate <=0 || weeks <= 0 || getWeeklyRate() <= 0)
        {
            return 0;
        }
        
        if(weeks >4)
        {
            return monthlyRate * Math.floor(weeks/4) + getWeeklyRate()*(weeks % 4);
        }
        else
        {
            return weeks * getWeeklyRate(); 
            
        }
    }

    /**
     * Overrides equals() to compare Furniture objects.
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

        Furniture other = (Furniture) o;
        return ABCRentals.nullSafeEquals(monthlyRate, other.monthlyRate);
    }

    /**
     * Creates a Furniture from a string in the format
     * id:desc:weeklyRate:rented:monthlyRate
     * @param string The string
     * @return the new DVDPlayer
     */
    public static Furniture createFromString(String string) {
        Furniture f = new Furniture();
        return f;
    }

    @Override
    public String saveToString() {
        return null;
    }
}
