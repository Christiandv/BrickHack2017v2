package MainGame;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Pie extends Powerup
{
    public Pie(int x, int y)
    {
        super(x,y);
        init();
    }

    public void init(){
        hard = false;
        type = 0;
        loadImage("media/images/pie.png");
        setImageDimensions();
    }
}