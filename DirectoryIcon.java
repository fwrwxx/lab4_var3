package lab4_var3;

/**
 * The DirectoryIcon class implements the GraphicIcon interface.
 * It represents an icon for a directory.
 */
public class DirectoryIcon implements GraphicIcon {
    private final String iconType;

    /**
     * Constructor for DirectoryIcon.
     * Initializes the icon type as "directory".
     */
    public DirectoryIcon() {
        this.iconType = "directory";
    }

    /**
     * Draws the directory icon at the specified coordinates.
     * 
     * @param x the x-coordinate to draw the icon
     * @param y the y-coordinate to draw the icon
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a directory icon at (" + x + ", " + y + ")");
    }
}