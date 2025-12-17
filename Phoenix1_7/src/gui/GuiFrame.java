/*
 * Draws the app window in conjunction with GuiPanel
 */

package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class GuiFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public GuiFrame() {

		initGuiFrame();
	}

	public void initGuiFrame() {

		add(new GuiPanel());

		setSize(900, 600);
		setResizable(false);

		setTitle("Phoenix1.7"+serialVersionUID);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
{

		EventQueue.invokeLater(new Runnable() 
		{
			@Override
			public void run() 
			{

				GuiFrame guiframe = new GuiFrame();
				guiframe.setVisible(true);
			}
		});
	}
}
