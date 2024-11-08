package lab4_var3;

/**
 * The FileIcon class implements the GraphicIcon interface.
 * It represents an icon for a file.
 */
public class FileIcon implements GraphicIcon {
    private final String iconType;

    /**
     * Constructor for FileIcon.
     * Initializes the icon type as "file".
     */
    public FileIcon() {
        this.iconType = "file";
    }

    /**
     * Draws the file icon at the specified coordinates.
     * 
     * @param x the x-coordinate to draw the icon
     * @param y the y-coordinate to draw the icon
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a file icon at (" + x + ", " + y + ")");
    }
}