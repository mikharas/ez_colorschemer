package colorschemer.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Config entity
 */
public class Config {
    private String template;
    private String colorscheme;
    private String targetPath;
    private Map<String, Color> colorMap;

    public Config(String colorscheme, String template, String targetPath, Map<String, Color> colorMap) {
        this.colorscheme = colorscheme;
        this.template = template;
        this.targetPath = targetPath;
        this.colorMap = colorMap;
    }

    /**
     * @return The colorscheme that the configuration is based off of.
     */
    public String getColorscheme() {
        return colorscheme;
    }

    /**
     * @return The name of the template used in this configuration.
     */
    public String getTemplateName() {
        return this.template;
    }

    /**
     * @return The path that this configuration file should be written to.
     */
    public String getTargetPath() {
        return this.targetPath;
    }

    /**
     * @return The mapping of identifiers/placeholders from the template file to
     *         their respective colors.
     */
    public Map<String, Color> getColorMap() {
        return new HashMap<>(this.colorMap);
    }
}
