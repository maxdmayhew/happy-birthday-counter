import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class happyBirthday extends JFrame implements ActionListener {
	

	/** constructor add a panel for displaying the timer and 
	 * a smaller panel for controls.
	 */
	
	public happyBirthday() {
		
		setTitle("Happy Birthday Counter!");
		birthdayCounter bdayCounter = new birthdayCounter();
		controlPanel controlP = new controlPanel(bdayCounter);
		setLayout(new BorderLayout());
		add(controlP, BorderLayout.CENTER);
		add(bdayCounter, BorderLayout.SOUTH);
		
		
		pack();
		//buildMenu();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		System.out.println("DAY CURRENTLY: " + bdayCounter.getDay());
		System.out.println("MONTH CURRENTLY: " + bdayCounter.getMonth());

		
	}
	
	public static void main(String [] agrs)
	{
		new happyBirthday();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
		
}