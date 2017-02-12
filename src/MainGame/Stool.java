/*
 * File: Stool.java
 *
 * The sprite and behavior for stool objects.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

public class Stool extends Sprite{

    public Stool (int x, int y)
    {
        super(x, y);

        init();
    }

    public void init(){
        hard = true;
        loadImage("media/images/stool.png");
        setImageDimensions();
    }
}
