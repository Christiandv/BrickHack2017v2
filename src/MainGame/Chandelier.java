/*
 * File: Chandelier.java
 *
 * The sprite and behavior for chandelier objects.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import java.util.ArrayList;

public class Chandelier {
    Sprite ChandelierBase;
    Sprite ChandelierBar;

    public Chandelier(int x, int y){
        ChandelierBase = new Sprite(x - 21, y - 65);
        ChandelierBar = new Sprite(x, y + 46);

        ChandelierBase.hard = false;
        ChandelierBar.hard = true;

        ChandelierBase.loadImage("media/images/chandelier.png");
        ChandelierBar.loadImage("media/images/chandelierCollisionBar.png");

        ChandelierBase.setImageDimensions();
        ChandelierBar.setImageDimensions();
    }

    public ArrayList<Sprite> getSprites()
    {
        ArrayList<Sprite> sprites = new ArrayList<Sprite>();
        sprites.add(ChandelierBase);
        sprites.add(ChandelierBar);
        return sprites;
    }

}
