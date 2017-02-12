package MainGame;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Bookcase extends Sprite
{
    public Bookcase (int x, int y)
    {
        super(x, y);

        init();
    }

    public void init(){
        hard = true;
        loadImage("media/images/bookcase.png");
        setImageDimensions();
    }
}