package MainGame;

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
        loadImage("media/images/pie.png");
        setImageDimensions();
    }
}