package MainGame.Collidables;

import MainGame.Sprite;

/**
 * Created by Caitlin on 2/12/2017.
 */
public class Fridge extends Sprite {

    public Fridge (int x, int y)
    {
        super(x, y);
        init();
    }

    public void init(){
        hard = true;
        loadImage("src/MainGame/Collidables/resources/refrigerator.png");
        setImageDimensions();
    }
}
