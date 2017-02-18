package MainGame.Pickups;

import MainGame.Pickups.Powerup;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Blanket extends Powerup
{
    public Blanket(int x, int y)
    {
        super(x,y);
        init();
    }

    public void init(){
        hard = false;
        type = 3;
        loadImage("src/MainGame/Pickups/resources/pie.png");
        setImageDimensions();
    }
}