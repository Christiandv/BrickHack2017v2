/*
 * File: Chair.java
 *
 * The sprite and behavior for chair objects.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import java.util.ArrayList;

public class Chair{
    Sprite chairBack;
    Sprite chairLegs;

    public Chair(int x, int y){
        chairBack = new Sprite(x + 49, y - 27);
        chairLegs = new Sprite(x, y + 46);

        chairBack.hard = true;
        chairLegs.hard = true;

        chairBack.loadImage("media/images/ChairBack.png");
        chairLegs.loadImage("media/images/ChairLegs.png");

        chairBack.setImageDimensions();
        chairLegs.setImageDimensions();
    }

    public ArrayList<Sprite> getSprites()
    {
        ArrayList<Sprite> sprites = new ArrayList<Sprite>();
        sprites.add(chairBack);
        sprites.add(chairLegs);
        return sprites;
    }

}
