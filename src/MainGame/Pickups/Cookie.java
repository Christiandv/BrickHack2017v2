package MainGame.Pickups;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Cookie extends Powerup {
    public Cookie(int x, int y)
    {
        super(x,y);
        init();
    }

    public void init(){
        hard = false;
        type = 1;
        loadImage("src/MainGame/Pickups/resources/cookie.png");
        setImageDimensions();
    }
}
