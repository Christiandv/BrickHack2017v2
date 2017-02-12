package MainGame;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Lego extends Powerup
{
    public Lego(int x, int y)
    {
        super(x,y);
        init();
    }

    public void init(){
        hard = false;
        type = 2;
        loadImage("media/images/pie.png");
        setImageDimensions();
    }
}