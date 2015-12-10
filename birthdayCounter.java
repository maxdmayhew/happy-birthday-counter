import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.Timer;

public class birthdayCounter extends JPanel implements ActionListener
{
	private int dayValue;
	private int monthValue;
	private DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
	private JLabel clock;

	public birthdayCounter() 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (ClassNotFoundException error) {} catch (InstantiationException e)
		{
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e)
		{
			e.printStackTrace();
		}
		
		Font newFont = new Font("Times New Roman", Font.BOLD, 18);
		
		
		JPanel b1 = new JPanel();
		setLayout(new GridLayout(1,3));
		b1.setBorder(BorderFactory.createLineBorder(Color.black));
		b1.setFont(newFont);
		
		clock = new JLabel("...");
		clock.setFont(clock.getFont().deriveFont(newFont.BOLD, 72f));
		
		b1.add(clock);
		updateClock();
		
		ActionListener callUpdateClock = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				updateClock();
			}
		};
		
		Timer timer = new Timer(500, callUpdateClock);
		timer.start();		
		
		add(b1);
		
				
		
	}
	
	
	
	
	
	
	
	
	
	
	private void updateClock()
	{
		clock.setText(dateFormat.format(System.currentTimeMillis()));
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
