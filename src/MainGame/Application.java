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


public class Application extends JFrame {


    private Application() {

        initUI();
    }

    private void initUI() {
        final int WIDTH = 700;
        final int HEIGHT = 400;
        add(new GraphicsEngine(WIDTH, HEIGHT));

        setSize(WIDTH, HEIGHT);

        setTitle("Application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);
        });
    }
}