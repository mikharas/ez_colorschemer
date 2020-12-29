package colorschemer.entity;

public class Color extends java.awt.Color {

    private static final long serialVersionUID = -7642723159553150762L;

    public Color(int r, int g, int b) {
        super(r, g, b);
    }

    public String getHex() {
        return String.format("#%02X%02X%02X", getRed(), getGreen(), getBlue());
    }

}
