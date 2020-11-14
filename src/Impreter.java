import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Impreter implements ActionListener {


		Object source;
	@Override
	public void actionPerformed(ActionEvent e) {
		source = e.getSource();
		if (source == ImageViewerFrame.exit)
		{
			System.exit(0);
		}
		if (source == ImageViewerFrame.open)
		{
			int result = ImageViewerFrame.chooser.showOpenDialog(null);
		    if(result == JFileChooser.APPROVE_OPTION) 
		    {
		     String Picture = ImageViewerFrame.chooser.getSelectedFile().getPath();
		     ImageViewerFrame.label.setIcon(new ImageIcon(Picture));
		}
	}

	}
}
