package MainGame;

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
        loadImage("media/images/pie.png");
        setImageDimensions();
    }
}