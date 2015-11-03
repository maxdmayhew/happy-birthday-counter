import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Timer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class birthdayCounter extends JPanel implements ActionListener
{
	private int dayValue;
	private int monthValue;
	private JLabel[] seperator;
	private JLabel second;
	private JLabel hour;
	private JLabel minute;
	

	public birthdayCounter() 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (ClassNotFoundException error) {} catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel b1 = new JPanel();
		setLayout(new GridLayout(1,3));
		b1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		second = new JLabel();
		hour = new JLabel();
		minute = new JLabel();
		
		changeDimension(second);
		changeDimension(hour);
		changeDimension(minute);
		
		b1.add(hour);
		b1.add(minute);
		b1.add(second);
		
		add(b1);
		
		//Timer t = new Timer(500, new timerListener());
				
		
	}
	
	
	
	
	
	
	
	
	
	
	private Dimension changeDimension(JLabel second2)
	{
		// TODO Auto-generated method stub
		FontMetrics fm = getFontMetrics(getFont());
		return new Dimension(fm.stringWidth("00"), fm.getHeight());
	}


    public void setValue(int aValue) {
    	int value = 0;
    	
        if (value != aValue) {
            int old = value;
            value = aValue;
            firePropertyChange("value", old, value);
            repaint();
        }
    }







	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void setDay(int thisDay)
	{
		// TODO Auto-generated method stub
		
	}

	public void setMonth(int thisMonth)
	{
		// TODO Auto-generated method stub
		
	}
	
	public int getDay()
	{
		return dayValue;
	}
	
	public int getMonth()
	{
		return monthValue;
	}
	
	private class timerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Calendar c = Calendar.getInstance();
			//hour.setValue(c.get(Calendar.HOUR_OF_DAY));
			
		}
	}
	
}
