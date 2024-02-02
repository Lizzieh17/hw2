import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener
{
	private View view;
	private Model model;

	public Controller(Model m)
	{
		model = m;
	}

	public void actionPerformed(ActionEvent e)
	{
		// System.out.println("Hey! I said not to push that button!");
		view.removeButton();
	}

	void setView(View v){
		view = v;
	}
}
