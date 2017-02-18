package MainGame.Pickups;

import MainGame.Pickups.Powerup;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Rocketship extends Powerup
{
    public Rocketship(int x, int y)
    {
        super(x,y);
        init();
    }

    public void init(){
        hard = false;
        type = 5;
        loadImage("src/MainGame/Pickups/resources/pie.png");
        setImageDimensions();
    }
}