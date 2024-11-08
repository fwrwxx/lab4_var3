package lab4_var3;

/**
 * The SpecialIcon class implements the GraphicIcon interface.
 * It represents an icon with special configuration.
 */
public class SpecialIcon implements GraphicIcon {
    private final String uniqueIconDetails;

    /**
     * Constructor for SpecialIcon.
     * Initializes the icon with unique configuration details.
     * 
     * @param details the unique configuration details for the icon
     */
    public SpecialIcon(String details) {
        this.uniqueIconDetails = details;
    }

    /**
     * Draws the special icon at the specified coordinates with the unique details.
     * 
     * @param x the x-coordinate to draw the icon
     * @param y the y-coordinate to draw the icon
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a special icon at (" + x + ", " + y + ") with details: " + uniqueIconDetails);
    }
}