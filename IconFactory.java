package lab4_var3;

import java.util.HashMap;
import java.util.Map;

/**
 * The IconFactory class is responsible for creating and managing the icons.
 * It ensures that icons are shared and reused efficiently.
 */
public class IconFactory {
    // A map to hold shared instances of icons
    private static final Map<String, GraphicIcon> icons = new HashMap<>();

    /**
     * Gets the icon of the specified type.
     * If the icon already exists, it returns the shared instance.
     * Otherwise, it creates a new icon of the requested type.
     * 
     * @param type the type of the icon ("file", "directory", or "special")
     * @return the requested GraphicIcon instance
     */
    public static GraphicIcon getIcon(String type) {
        // If the type is "special", create a new special icon instance
        if (type.equals("special")) {
            return new SpecialIcon("Unique configuration");
        }
        
        // If the icon is already created, return the shared instance from the map
        return icons.computeIfAbsent(type, key -> {
            switch (key) {
                case "file":
                    return new FileIcon();
                case "directory":
                    return new DirectoryIcon();
                default:
                    throw new IllegalArgumentException("Unknown icon type: " + key);
            }
        });
    }
}