package MainGame;

/**
 * Created by Hephaestus on 2/12/2017.
 */
public class Background extends Sprite{
    public Background(int x, int y){
        super(x, y);

        init();
    }

    public void init(){
        hard = false;
        loadImage("media/images/wallPost.png");
        setImageDimensions();
    }
}
