package MainGame;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Powerup extends Sprite
{
    public int type;

    //0 - cube (life)
    //1 - cookie (coin)
    //2 - lego
    //3 - blanket
    //4 - saucepan
    //5 - rocket ship

    public Powerup(int x, int y)
    {
        super(x, y);
        type = 0;
    }
}
