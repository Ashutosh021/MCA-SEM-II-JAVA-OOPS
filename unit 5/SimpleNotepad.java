import javax.swing.*;
import java.awt.*;

public class SimpleNotepad {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Notepad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        // Create a text area
        JTextArea textArea = new JTextArea();
        
        // Add the text area to a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        // Add the scroll pane to the frame
        frame.add(scrollPane, BorderLayout.CENTER);
        
        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        
        // Create a "File" menu
        JMenu fileMenu = new JMenu("File");
        
        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        // Add menu items to the "File" menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);
                // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}















// import javax.swing.*;
// import java.awt.event.*;
// import java.io.*;

// public class SimpleNotepad extends JFrame implements ActionListener {
//     JTextArea textArea;
//     JMenuBar menuBar;
//     JMenu menu;
//     JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;

//     public SimpleNotepad() {
//         // Set up the frame
//         setTitle("Simple Notepad");
//         setSize(500, 500);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Create text area
//         textArea = new JTextArea();
//         add(new JScrollPane(textArea));

//         // Create menu bar
//         menuBar = new JMenuBar();

//         // Create menu
//         menu = new JMenu("File");
//         menuBar.add(menu);

//         // Create menu items
//         newMenuItem = new JMenuItem("New");
//         openMenuItem = new JMenuItem("Open");
//         saveMenuItem = new JMenuItem("Save");
//         exitMenuItem = new JMenuItem("Exit");

//         // Add action listeners
//         newMenuItem.addActionListener(this);
//         openMenuItem.addActionListener(this);
//         saveMenuItem.addActionListener(this);
//         exitMenuItem.addActionListener(this);

//         // Add menu items to menu
//         menu.add(newMenuItem);
//         menu.add(openMenuItem);
//         menu.add(saveMenuItem);
//         menu.add(exitMenuItem);

//         // Set menu bar
//         setJMenuBar(menuBar);
//     }

//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == newMenuItem) {
//             textArea.setText("");
//         } else if (e.getSource() == openMenuItem) {
//             JFileChooser fileChooser = new JFileChooser();
//             int option = fileChooser.showOpenDialog(this);
//             if (option == JFileChooser.APPROVE_OPTION) {
//                 try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
//                     textArea.read(reader, null);
//                 } catch (IOException ex) {
//                     ex.printStackTrace();
//                 }
//             }
//         } else if (e.getSource() == saveMenuItem) {
//             JFileChooser fileChooser = new JFileChooser();
//             int option = fileChooser.showSaveDialog(this);
//             if (option == JFileChooser.APPROVE_OPTION) {
//                 try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
//                     textArea.write(writer);
//                 } catch (IOException ex) {
//                     ex.printStackTrace();
//                 }
//             }
//         } else if (e.getSource() == exitMenuItem) {
//             System.exit(0);
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             SimpleNotepad notepad = new SimpleNotepad();
//             notepad.setVisible(true);
//    });
// }
// }