package BS_Window;
import java.awt.* ;
import javax.swing.* ;

/**
 This class is intended to make a simple window, in set dimensions with a given tilesize
 http://zetcode.com/tutorials/javagamestutorial/movingsprites/ --> for help
**/

public class Window {
    public static void main(String[] args) throws HeadlessException{
        Window(5);
    }

    static GraphicsConfiguration gc;

   public static void Window(int size) throws HeadlessException {

       JFrame frame = new JFrame(gc);
       frame.setTitle("Hello World!");
       frame.setSize(600   ,1000);
       frame.setLocation(600,0);
/*       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
       frame.pack();*/
       frame.setVisible(true);
/*       Graphics2D Graph = (Graphics2D) g;
       ImageIcon imago = new ImageIcon("src/Resources/Dot.png");
       image = imago.getImage();
       Graph.drawImage();*/
   }



}