import javax.swing.*;

public class Window {

    public static class main(String[] args){
        // creating instance of JFrame with name "first way"
        frame okay  =new JFrame("first way");

        // creates instance of JButton
        JButton button = new JButton("let's see");

        button.setBounds(200, 150, 90, 50);

        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adds button in JFrame
        frame.add(button);

        // sets 500 width and 600 height
        frame.setSize(500, 600);

        // uses no layout managers
        frame.setLayout(null);

        // makes the frame visible
        frame.setVisible(true);
    }
}
