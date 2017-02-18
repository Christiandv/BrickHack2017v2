package MainGame.Collidables;

import MainGame.Sprite;

/**
 * Created by Caitlin on 2/12/2017.
 */
public class Glass extends Sprite {
    public Glass (int x, int y)
    {
        super(x, y);
        init();
    }

    public void init()
    {
        hard = true;
        hurts = true;
        loadImage("src/MainGame/Collidables/resources/brokenGlass.png");
        setImageDimensions();
    }
}