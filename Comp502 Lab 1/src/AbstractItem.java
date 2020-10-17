/**
 * This class represents an abstract item to be rented.
 *
 * @author Franklin University
 * @version 2.0
 */

//test comment

public abstract class AbstractItem implements Item
{
    // Instance variables
    private String description;
    private double weeklyRate;
    private String id;
    private boolean isRentedOut;

   /**
     * Return the description of the item.
     * @return the description.
     */
    @Override
    public String getDescription()
    {
        return this.description;    //TODO: remove
    }

    /**
     * Change the description of the item to the
     * given parameter.
     * @param desc the new description.
     */
    @Override
    public void setDescription(String desc)
    {
        this.description = desc; 
    }

   /**
     * Return the weekly rental rate for the item.
     * @return the rate.
     */
    @Override
    public double getWeeklyRate()
    {
        return this.weeklyRate; 
    }

    /**
     * Change the weekly rental rate of the item
     * to the given parameter.
     * @param wklyRate the new weekly rate.
     */
    @Override
    public void setWeeklyRate(double wklyRate)
    {
        this.weeklyRate = wklyRate; 
    }

    /**
     * Return the ID of the item.
     * @return the ID.
     */
    @Override
    public String getId()
    {
        return this.id; 
    }

    /**
     * Change the ID of the item to the given
     * parameter.
     * @param idNum the new ID.
     */
    @Override
    public void setId(String idNum)
    {
        this.id = idNum;    //TODO: remove
    }

    /**
     * Calculate the fees for renting the item for a given
     * number of weeks.
     * @param weeks the number of rental weeks
     * @return the fee
     */
    @Override
    public double calculateFee(int weeks)
    {
        if(weeks >= 0) {
        	return this.weeklyRate * weeks;
        }
        else { 
        	return 0;
        }
    }

    /**
     * Indicate the item has been rented.
     */
    @Override
    public void rented()
    {
        this.isRentedOut = true;    //TODO: remove
    }

    /**
     * Indicate the item has been returned and is no
     * longer rented.
     */
    @Override
    public void returned()
    {
        this.isRentedOut = false;    //TODO: remove
    }

    /**
     * Return the rental status of the item.
     * @return true if the item is rented, otherwise false.
     */
    @Override
    public boolean isRented()
    {
        return this.isRentedOut;    //TODO: remove
    }

    /**
     * Overrides equals() to compare AbstractItem objects.
     * @param o the object against which to compare.
     * @return true if the two objects are equal by value, otherwise false.
     */
    @Override
    public boolean equals(Object o)
    {
        if (o == null)
        {
            return false;
        }

        AbstractItem other = (AbstractItem) o;
        return isRentedOut == other.isRentedOut &&
                ABCRentals.nullSafeEquals(weeklyRate, other.weeklyRate) &&
                ABCRentals.nullSafeEquals(description, other.description) &&
                ABCRentals.nullSafeEquals(id, other.id);
    }
}
