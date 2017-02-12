package MainGame;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Shelf extends Sprite
{
    int maxY;
    boolean down = false;
    public Shelf (int x, int y)
    {
        super(x, y);
        maxY = y;
        init();
    }

    public void update(){
        if(down) {
            y--;
            if (y < 0)
                y = 0;
        } else {
            y++;
            if(y > maxY)
                y = maxY;
        }
    }
    public void init(){
        hard = true;
        loadImage("media/images/shelf.png");
        setImageDimensions();
    }
}
