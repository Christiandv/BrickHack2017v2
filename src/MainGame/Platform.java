package MainGame;

/*
 * File: Platform.java
 *
 * platform
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

public class Platform extends Sprite
{
    public Platform (int x, int y)
    {
        super(x, y);

        init();
    }

    public void init(){
        hard = true;
        loadImage("media/images/platform.png");
        setImageDimensions();
    }
}
