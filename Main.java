package lab4_var3;

/**
 * The Main class demonstrates the use of Flyweight pattern for graphical icons.
 * It creates various types of icons and draws them at different coordinates.
 */
public class Main {
    public static void main(String[] args) {
        // Get instances of icons from the factory
        GraphicIcon fileIcon1 = IconFactory.getIcon("file");
        GraphicIcon fileIcon2 = IconFactory.getIcon("file");
        GraphicIcon directoryIcon = IconFactory.getIcon("directory");
        GraphicIcon specialIcon = IconFactory.getIcon("special");

        // Check if the fileIcon1 and fileIcon2 are the same instance (they should be)
        System.out.println("fileIcon1 == fileIcon2: " + (fileIcon1 == fileIcon2));

        // Draw the icons at different coordinates
        fileIcon1.draw(10, 10);
        fileIcon2.draw(20, 20);
        directoryIcon.draw(30, 30);
        specialIcon.draw(40, 40); // Drawing special icon with unique details
    }
}
