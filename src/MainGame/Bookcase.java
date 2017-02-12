package MainGame;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Bookcase extends Sprite
{
    int maxY;
    boolean down = false;
    public Bookcase (int x, int y)
    {
        super(x, y);
        maxY = y;
        init();
    }
    public void update(){
        if(down) {
            y++;
            if (y > 460)
                y = 460;
        } else {
            y--;
            if(y < maxY)
                y = maxY;
        }
    }

    public void init(){
        hard = true;
        loadImage("media/images/bookcase.png");
        setImageDimensions();
    }
}