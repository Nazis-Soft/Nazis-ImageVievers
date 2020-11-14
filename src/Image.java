import javax.swing.*;
import java.io.*;

public class Image {
public static void main(String[] args) {	  
    JFrame frame = new ImageViewerFrame();
    
    try {
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.updateComponentTreeUI(frame);
    } 
    catch (UnsupportedLookAndFeelException e) {
   
    }
    catch (ClassNotFoundException e) {
         
    }
    catch (InstantiationException e) {
   
    }
    catch (IllegalAccessException e) {
   
    }
    frame.setTitle("Image Viewer App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
  };
 }



@SuppressWarnings("serial")

class ImageViewerFrame extends JFrame {
  
	
	 static JLabel label;
	 static JFileChooser chooser;
	 static JMenuBar menubar;
	 static JMenu menu;
	 static JMenuItem open;
	 static JMenuItem exit;
	 
 public ImageViewerFrame() {
  
  setSize(500,500);
  

  label = new JLabel();
  add(label);
  

  chooser = new JFileChooser();
  chooser.setCurrentDirectory(new File("."));
  

  menubar = new JMenuBar();
  setJMenuBar(menubar);
  
  menu = new JMenu("File");
  menubar.add(menu);
  
  open = new JMenuItem("Open");
  open.setAccelerator(KeyStroke.getKeyStroke("alt O"));
  open.addActionListener(new Impreter());
  menu.add(open);
  
  exit = new JMenuItem("Exit");
  exit.setAccelerator(KeyStroke.getKeyStroke("alt F4"));
  exit.addActionListener(new Impreter());		
  menu.add(exit);
 }
 
}