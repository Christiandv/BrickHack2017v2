package MainGame.Pickups;

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
        type = 6;
        loadImage("src/MainGame/Pickups/resources/pie.png");
        setImageDimensions();
    }
}