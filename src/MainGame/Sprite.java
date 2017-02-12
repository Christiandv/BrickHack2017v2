/*
 * File: Sprite.java
 *
 * The entity super-class, which handles drawing
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean vis;
    protected Image image;
    public boolean hard;

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        vis = true;
        hard = false;
    }

    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    protected void loadImage(String imageName) {

        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return vis;
    }

    public boolean isHard() { return hard; }

    public void setHard() { hard = true; }

    public void setVisible(Boolean visible) {
        vis = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}