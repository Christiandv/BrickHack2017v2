/*
 * File: Application.java
 *
 * The main application which runs the game and creates the screen
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;
import java.awt.EventQueue;
import javax.swing.*;


public class Game extends JFrame {


    private Game() {

        initUI();
    }

    private void initUI() {
        final int WIDTH = 700;
        final int HEIGHT = 440;
        add(new GraphicsEngine(WIDTH, HEIGHT -40));

        setSize(WIDTH, HEIGHT);

        setTitle("Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Game ex = new Game();
            ex.setVisible(true);
        });
    }
}