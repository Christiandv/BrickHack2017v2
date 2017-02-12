package MainGame;

import java.util.ArrayList;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Chandelier {
    Sprite ChandelierBase;
    Sprite ChandelierBar;

    public Chandelier(int x, int y){
        ChandelierBase = new Sprite(x + 49, y - 27);
        ChandelierBar = new Sprite(x, y + 46);

        ChandelierBase.hard = true;
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
