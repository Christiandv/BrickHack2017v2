package MainGame;

/**
 * Created by Caitlin on 2/12/2017.
 */
public class Cube extends Powerup
{
    public Cube(int x, int y)
    {
        super(x,y);
        init();
    }

    public void init(){
        hard = false;
        type = 0;
        loadImage("media/images/cube.png");
        setImageDimensions();
    }
}
