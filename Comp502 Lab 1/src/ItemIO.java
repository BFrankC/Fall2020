import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The ItemIO class is used to read and write items to a text file
 * @author timkington
 * @version 1
 *
 */
public class ItemIO {

    /**
     * Saves a list of items to the given file.
     * @param filename the filename
     * @param items the items
     * @throws IOException if there's an error writing the file
     */
    public static void saveItems(String filename, List<Item> items)
            throws IOException {
            // I'm not sure why we didn't write code for this.
            // We appear to accomplish the same task in each class.
    }
   
    

    /**
     * Loads a list of items from the given file.  Each line is in the format
     * <item type>~<item data>.  The createFromString() methods in the item
     * classes will be used to parse the item data.
     * @param filename the filename
     * @return the list of items
     * @throws IOException if the file can't be opened
     */
    public static List<Item> loadItems(String filename) throws IOException {
        ArrayList<Item> items = new ArrayList<>();
        try (Scanner input = new Scanner(new File(filename)))
        {
            while (input.hasNext())
            {
                input.useDelimiter("~");
                String type = input.next();
                input.skip("~");
                
                switch(type)
                {
                    case "DVDPlayer":
                        items.add(DVDPlayer.createFromString(input.nextLine()));
                        break;
                    case "Furniture":
                        items.add(Furniture.createFromString(input.nextLine()));
                        break;
                    case "Television":
                        items.add(Television.createFromString(
                                input.nextLine()));   
                        // Line character limits are an obsolete practice.
                        break;
                    default:
                        //error reading. throw exception.
                }
            }
        }           
        return items;
    }
}
