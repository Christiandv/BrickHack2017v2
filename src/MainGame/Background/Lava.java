package MainGame.Background;

import MainGame.Sprite;

/**
 * Created by Chris on 2/11/2017.
 */
public class Lava extends Sprite {
    public Lava (int x, int y)
    {
        super(x, y);

        init();
    }

    public void init(){

        hurts = true;
        loadImage("src/MainGame/Background/resources/lava.png");
        setImageDimensions();
    }
}
