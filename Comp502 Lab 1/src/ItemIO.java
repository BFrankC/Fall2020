import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        List<Item> items = new ArrayList<>();

        return items;
    }
}
