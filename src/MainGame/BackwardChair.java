/*
 * File: BackwardChair.java
 *
 * The sprite and behavior for chair objects that have to face the other way.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import java.util.ArrayList;

public class BackwardChair {
    Sprite chairBack;
    Sprite chairLegs;

    public BackwardChair(int x, int y){
        chairBack = new Sprite(x, y - 27);
        chairLegs = new Sprite(x, y + 46);

        chairBack.hard = true;
        chairLegs.hard = true;

        chairBack.loadImage("media/images/ChairBack.png");
        chairLegs.loadImage("media/images/ChairLegsFlipped.png");

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
