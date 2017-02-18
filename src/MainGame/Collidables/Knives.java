package MainGame.Collidables;

import MainGame.Sprite;

/**
 * Created by Caitlin on 2/12/2017.
 */
public class Knives extends Sprite {
    public Knives (int x, int y)
    {
        super(x, y);
        init();
    }

    public void init()
    {
        hard = true;
        hurts = true;
        loadImage("src/MainGame/Collidables/resources/pie.png");
        setImageDimensions();
    }
}