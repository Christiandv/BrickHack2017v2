package MainGame;

/**
 * Created by Chris on 2/11/2017.
 */
public class Fireball extends Sprite{
    public Fireball (int x, int y)
    {
        super(x, y);

        init();
    }

    public void init(){

        hurts = true;
        hard = true;
        loadImage("media/images/fireball.gif");
        setImageDimensions();
    }
}
