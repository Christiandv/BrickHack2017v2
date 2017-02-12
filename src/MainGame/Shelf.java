package MainGame;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Shelf extends Sprite
{
    public Shelf (int x, int y)
    {
        super(x, y);

        init();
    }

    public void init(){
        hard = true;
        loadImage("media/images/shelf.png");
        setImageDimensions();
    }
}
