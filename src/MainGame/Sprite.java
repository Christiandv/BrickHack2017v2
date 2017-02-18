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

    public int x;
    public int y;
    public int width;
    public int height;
    protected boolean vis;
    protected Image image;
    public boolean hard;
    public boolean hurts;


    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        vis = true;
        hard = false;
        hurts = false;
    }

    public void setImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    public void loadImage(String imageName) {

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

    public void setHard() { hard = true; };

    public void setVisible(Boolean visible) {
        vis = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}