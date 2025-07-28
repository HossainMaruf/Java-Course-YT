import javax.swing.*;

public class MainFrame {
    JFrame frame = null; 
    public MainFrame() {
        frame = new JFrame("App"); // create a frame or GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program when close the window
        frame.setSize(400, 300); // set the frame Dimension
        frame.setVisible(true); // show the frame
    }

}
