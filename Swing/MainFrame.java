import javax.swing.*;
import java.awt.event.*;

public class MainFrame {
    JFrame frame = null;
    JButton button = null;

    public MainFrame() {
        frame = new JFrame("App"); // create a frame or GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program when close the window
        frame.setSize(400, 300); // set the frame Dimension
        frame.setLayout(null); // default is BorderLayout for JFrame, need to set null for manual positioning using setBounds()

        // Adding the design
        button = new JButton("Click Me");
        button.setBounds(0, 20, 80, 40);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button was clicked!");
            }
        });
        frame.add(button);

        frame.setVisible(true); // show the frame
    }

}
