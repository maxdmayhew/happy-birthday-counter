import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JTextField;


public class controlPanel extends JPanel implements ActionListener
{

	Dimension newDimension = new Dimension(500, 400);
	
	JComboBox<Integer> dayField;
	JComboBox<Integer> monthField;
	//JComboBox<Integer> yearField;
	JLabel dayTag;
	JLabel monthTag;
	JLabel yearTag;
	JLabel emptySpace;
	JButton finished;
	JButton reset;

	private birthdayCounter bdp;
	
	
	public controlPanel(birthdayCounter bdPanel)
	{
		bdp = bdPanel;
		
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(500, 75));
		setLayout(new BorderLayout());
		Font newFont = new Font("Times New Roman", Font.BOLD, 18);

		
		JPanel p1 = new JPanel();
		finished = new JButton("Finished");
		finished.addActionListener(new finishedListener());
		p1.add(finished);
		reset = new JButton("Reset");
		reset.addActionListener(new resetListener());
		p1.add(reset);
		p1.setPreferredSize(new Dimension(200,50));
		p1.setFont(newFont);
		add(p1, BorderLayout.NORTH);
		
		//** Adding the combo boxes for picking your date **//
		JPanel p2 = new JPanel();
		
		Integer[] dayArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		Integer[] monthArray = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		dayField = new JComboBox<Integer>(dayArray);
		dayField.setSelectedIndex(0);
		dayField.addActionListener(new dayFieldListener());
		dayTag = new JLabel("Day: ");
		emptySpace = new JLabel("\t");
		monthField = new JComboBox<Integer>(monthArray);
		monthField.setSelectedIndex(0);
		monthField.addActionListener(new monthFieldListener());
		monthTag = new JLabel("Month: ");
		
		p2.add(dayTag);
		p2.add(dayField);
		p2.add(emptySpace);
		p2.add(monthTag);
		p2.add(monthField);
				
		add(p2, BorderLayout.SOUTH);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		
	}
	
	private class finishedListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(bdp.getDay() != 0 && bdp.getMonth() != 0)
			{
				//do stuff...
			}
		}
	}
	
	private class resetListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			bdp.setMonth(0);
			bdp.setDay(0);
			
			System.out.println("CDAY CURRENTLY: " + bdp.getDay());
			System.out.println("CMONTH CURRENTLY: " + bdp.getMonth());
			
			//other stuff needs to be added later...	
		}
	}
	
	private class dayFieldListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JComboBox cb = (JComboBox)event.getSource();
			int thisDay = (int) cb.getSelectedItem();
			System.out.print("\n\n" + thisDay);
			
			bdp.setDay(thisDay);
		}
	}
	
	private class monthFieldListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JComboBox cb = (JComboBox)event.getSource();
			int thisMonth = (int) cb.getSelectedItem();
			System.out.print("\n\n" + thisMonth);
			
			bdp.setMonth(thisMonth);
		}
	}

	
	
	//** END OF FILE **//
}
