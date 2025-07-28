import javax.swing.*;
import java.awt.event.*;

public class MainFrame {
    JFrame frame = null;
    JButton button = null;
    JTextField textField = null;
    JLabel label = null;

    public MainFrame() {
        frame = new JFrame("App"); // create a frame or GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program when close the window
        frame.setSize(400, 300); // set the frame Dimension
        frame.setLayout(null); // default is BorderLayout for JFrame, need to set null for manual positioning
                               // using setBounds()

        // Creating object for the MainFrame
        label = new JLabel("Message");
        textField = new JTextField();
        button = new JButton("Click Me");
        // Setting size and position of the objects
        label.setBounds(0, 0, 70, 30);
        textField.setBounds(72, 0, 80, 30);
        button.setBounds(155, 0, 80, 30);

        // Adding action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // JOptionPane.showMessageDialog(frame, "Button was clicked!");
                JOptionPane.showMessageDialog(frame, textField.getText());
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true); // show the frame
    }

}
