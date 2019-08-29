import java.awt.* ;
import javax.swing.* ;
import Battle_Simulator/src/* ;


/**
 This class is intended to make a simple window, in set dimensions with a given tilesize
**/

public class Window(int size) {
   public static void Window(int size) {
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
            }

    public static void class main() {
        Window wuwu = new Window(5);
            }

        }