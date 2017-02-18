package MainGame.Collidables;

import MainGame.Sprite;

/**
 * Created by Hephaestus on 2/12/2017.
 */
public class Countertop extends Sprite {
    public Countertop (int x, int y)
    {
        super(x, y);

        init();
    }


    public void init(){
        hard = true;
        loadImage("src/MainGame/Collidables/resources/countertop.png");
        setImageDimensions();
    }
}
