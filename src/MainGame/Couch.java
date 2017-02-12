/*
 * File: Couch.java
 *
 * The sprite and couch behavior for couches.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import java.util.ArrayList;

public class Couch
{
    protected Sprite couch_mid;
    protected Sprite couch_back;
    protected Sprite couch_left;
    protected Sprite couch_right;

    public Couch(int x, int y)
    {
        couch_mid = new Sprite(x+38, y+47);
        couch_back = new Sprite(x+3, y+10);
        couch_right = new Sprite(x+158, y+47);
        couch_left = new Sprite(x, y+47);

        couch_mid.hard = true;
        couch_right.hard = true;
        couch_left.hard = true;
        couch_back.hard = false;

        couch_mid.loadImage("media/images/couchCenter.png");
        couch_back.loadImage("media/images/couchBack.png");
        couch_right.loadImage("media/images/couchArmRight.png");
        couch_left.loadImage("media/images/couchArmLeft.png");

        couch_mid.setImageDimensions();
        couch_back.setImageDimensions();
        couch_left.setImageDimensions();
        couch_right.setImageDimensions();
    }

    public ArrayList<Sprite> getSprites()
    {
        ArrayList<Sprite> sprites = new ArrayList<Sprite>();
        sprites.add(couch_mid);
        sprites.add(couch_back);
        sprites.add(couch_left);
        sprites.add(couch_right);
        return sprites;
    }
}