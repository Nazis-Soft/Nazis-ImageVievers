import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Impreter implements ActionListener {


		Object source;
	@Override
	public void actionPerformed(ActionEvent e) {
		source = e.getSource();
		if (source == Image.exit)
		{
			
		}
	}

}
