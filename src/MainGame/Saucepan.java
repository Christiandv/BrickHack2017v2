package MainGame;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Saucepan extends Powerup
{
    public Saucepan(int x, int y)
    {
        super(x,y);
        init();
    }

    public void init(){
        hard = false;
        type = 4;
        loadImage("media/images/pie.png");
        setImageDimensions();
    }
}