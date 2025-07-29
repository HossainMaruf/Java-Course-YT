import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class MainFrame {
    JFrame frame = null;
    JPanel inputPanel = null, todosPanel = null;
    JTextField todo = null;
    JButton addBtn = null, dltBtn = null;

    public MainFrame() {
        frame = new JFrame("Todo App"); // create a frame or GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program when close the window
        frame.setSize(600, 300); // set the frame Dimension

        // Creating panel
        inputPanel = new JPanel();
        todosPanel = new JPanel();
        // Creating object for the panel
        todo = new JTextField(20);
        addBtn = new JButton("Add");


        inputPanel.add(todo);
        inputPanel.add(addBtn);
        frame.add(inputPanel, BorderLayout.NORTH);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<String>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane, BorderLayout.CENTER);


        // Adding action listener to the button
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = todo.getText().trim();
                if (!text.isEmpty()) {
                    listModel.addElement(text); // Add to model
                    todo.setText("");     // Clear input field
                }
            }
        });

        frame.setVisible(true); // show the frame
    }

}
