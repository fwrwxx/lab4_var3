package lab4_var3;

/**
 * The GraphicIcon interface defines the method for drawing graphical icons.
 * All concrete icons must implement this method.
 */
public interface GraphicIcon {
    /**
     * Draws the graphical icon at the specified coordinates.
     * 
     * @param x the x-coordinate to draw the icon
     * @param y the y-coordinate to draw the icon
     */
    void draw(int x, int y);
}
