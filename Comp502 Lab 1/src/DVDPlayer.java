
/**
 * This class represents a DVD player to be rented.
 *
 * @author Franklin University
 * @version 2.0
 */
public class DVDPlayer extends AbstractItem
{

    /**
     * Constructor for objects of class DVDPlayer.
     */
    public DVDPlayer()
    {
        // No code needed
    }

    /**
     * Creates a DVDPlayer from a string in the format
     * id:desc:weeklyRate:rented
     * @param string The string
     * @return the new DVDPlayer
     */
    public static DVDPlayer createFromString(String string) {
        String stringArray[] = string.split(":");
        DVDPlayer player = new DVDPlayer();
        player.setId(stringArray[0]);
        player.setDescription(stringArray[1]);
        player.setWeeklyRate(Double.parseDouble(stringArray[2]));
        if ( stringArray[3].compareTo("true") == 0 )
        {
            player.rented();
        }
        else if (stringArray[3].compareTo("false") == 0 )
        {
            player.returned();
        }
        else
        {
            //bad read.  We should thrown and exception / panic.
        }
        int x = 5;
        x += 2;
        
        return player;
        
    }

    @Override
    public String saveToString() {
        
        return null;
    }
}
