package colorschemer.entity;

import java.util.List;

/**
 * Template entity
 */
public class Template {
    private String extension;
    private String name;
    private String targetPath;
    private List<String> identifiers;

    public static String getRootDir() {
        return "/templates";
    }

    public Template(String file, String targetPath, List<String> identifiers) {
        this.extension = file.split(".")[0];
        this.name = file.split(".")[1];
        this.identifiers = identifiers;
    }

    /**
     * @return The extension of the template file (.vim).
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @return The name of the template file.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The path of where all config files of this template should be written
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * @return The list of identifiers that are used as placeholders for colors in
     *         the template file
     */
    public List<String> getIdentifiers() {
        return identifiers;
    }
}
