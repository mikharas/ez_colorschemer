package colorschemer.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Colorscheme entity
 */
public class Colorscheme {
    private String name;
    private List<Color> colors;

    public Colorscheme(String name, List<Color> initialColors) {
        this.colors = initialColors;
    }

    /**
     * @return The name of the colorscheme.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return The colors of the colorscheme.
     */
    public List<Color> getColors() {
        return new ArrayList<>(this.colors);
    }

}
