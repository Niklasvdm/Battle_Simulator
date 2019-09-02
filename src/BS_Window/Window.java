package BS_Window;
import java.lang.*;
import java.awt.* ;
import javax.swing.* ;

/**
 This class is intended to make a simple window, in set dimensions with a given tilesize
 http://zetcode.com/tutorials/javagamestutorial/movingsprites/ --> for help

 For Jpanel, make an Actionhandler on the JPanel. Then this.add. .. Actionhandler --> make a class that extends an actionhandler with @Override. And in these functions
 tell the 'repaint' function what to do exactly. Thi repainter is basically the FPS.
**/

public class Window extends JFrame {

    static GraphicsConfiguration gc;

   public static void window(int size) throws HeadlessException {

       JFrame frame = new JFrame(gc);
       frame.setTitle("Hello World!");
       frame.setSize(600   ,1000);
       frame.setLocation(600,0);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(new Label(), BorderLayout.CENTER);
       frame.pack();
       frame.setVisible(true);

//       Graphics2D Graph = (Graphics2D) g;
//       ImageIcon imago = new ImageIcon("src/Resources/Dot.png");
//       image = imago.getImage();
//       Graph.drawImage();
 
   }

   public static void main(String[] args) throws HeadlessException {
        window(5);
    }



}