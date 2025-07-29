import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class MainFrame {
    JFrame frame = null;
    JPanel namePanel = null, passwordPanel = null;
    JLabel nameLabel = null, passwordLabel = null;
    JTextField nameField = null;
    JPasswordField passwordField = null;
    JButton nameBtn = null, passwordBtn = null;

    public MainFrame() {
        frame = new JFrame("App"); // create a frame or GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program when close the window
        frame.setSize(600, 300); // set the frame Dimension

        // Creating panel
        namePanel = new JPanel();
        passwordPanel = new JPanel();
        // Creating object for the panel
        nameLabel = new JLabel("Name");
        passwordLabel = new JLabel("Password");
        nameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        nameBtn = new JButton("Check Name");
        passwordBtn = new JButton("Check Password");
      

        // Adding action listener to the button
        nameBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if(name.equals("")) return;
                else {
                    // TODO: validation rule is not enough now
                    JOptionPane.showMessageDialog(frame, "valid");
                }
            }
        });

        passwordBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] charPassword = passwordField.getPassword();
                String password = new String(charPassword);
                if(password.equals("")) return;
                else {
                    // TODO: validation rule is not enough now
                    JOptionPane.showMessageDialog(frame, "valid");
                }
            }
        });

        namePanel.add(nameLabel);
        namePanel.add(nameField);
        namePanel.add(nameBtn);
        frame.add(namePanel, BorderLayout.NORTH);

        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        passwordPanel.add(passwordBtn);
        frame.add(passwordPanel, BorderLayout.CENTER);

        frame.setVisible(true); // show the frame
    }

}
