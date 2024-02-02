import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener
{
	public Controller()
	{
	}

	public void actionPerformed(ActionEvent e)
	{
		// System.out.println("Hey! I said not to push that button!");
		view.removeButton();
	}

	private View view;

	void setView(View v){
		view = v;
	}
}
