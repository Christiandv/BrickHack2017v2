/*
 * File: Couch.java
 *
 * The sprite and couch behavior for couch objects.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame.Collidables;

import MainGame.Sprite;

import java.util.ArrayList;

public class Couch
{
    protected Sprite couch_mid;
    protected Sprite couch_back;
    protected Sprite couch_left;
    protected Sprite couch_right;

    public Couch(int x, int y)
    {
        couch_mid = new Sprite(x+38, y+63);
        couch_back = new Sprite(x+3, y+10);
        couch_right = new Sprite(x+154, y+47);
        couch_left = new Sprite(x+3, y+47);

        couch_mid.hard = true;
        couch_right.hard = true;
        couch_left.hard = true;
        couch_back.hard = false;

        couch_mid.loadImage("src/MainGame/Collidables/resources/couchCenter.png");
        couch_back.loadImage("src/MainGame/Collidables/resources/couchBack.png");
        couch_right.loadImage("src/MainGame/Collidables/resources/couchArmRight.png");
        couch_left.loadImage("src/MainGame/Collidables/resources/couchArmLeft.png");

        couch_mid.setImageDimensions();
        couch_back.setImageDimensions();
        couch_left.setImageDimensions();
        couch_right.setImageDimensions();
    }

    public ArrayList<Sprite> getSprites()
    {
        ArrayList<Sprite> sprites = new ArrayList<Sprite>();

        sprites.add(couch_back);
        sprites.add(couch_left);
        sprites.add(couch_right);
        sprites.add(couch_mid);
        return sprites;
    }
}