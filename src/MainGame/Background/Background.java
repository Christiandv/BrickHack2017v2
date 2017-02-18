package MainGame.Background;

import MainGame.Sprite;

/**
 * Created by Hephaestus on 2/12/2017.
 */
public class Background extends Sprite {
    public Background(int x, int y){
        super(x, y);

        init();
    }

    public void init(){
        hard = false;
        loadImage("src/MainGame/Background/resources/wallPost.png");
        setImageDimensions();
    }
}
