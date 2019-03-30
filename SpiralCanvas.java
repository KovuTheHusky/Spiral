import java.awt.*;
import javax.swing.*;

public class SpiralCanvas extends Canvas
{
	public void paint(Graphics g)
	{
		try
		{
			for (;;)
			{
				g.setColor(Color.BLACK);
				for (double i = 0; i < 15; i += .1)
				{
					Thread.sleep(25);
					int x1 = (int)(250 + 15 * i * Math.sin(i));
					int y1 = (int)(250 + 15 * i * Math.cos(i));
					int x2 = (int)(250 + 15 * (i + .1) * Math.sin(i + .1));
					int y2 = (int)(250 + 15 * (i + .1) * Math.cos(i + .1));
					g.drawLine(x1, y1, x2, y2);
				}
				g.setColor(Color.WHITE);
				for (double i = 0; i < 15; i += .1)
				{
					Thread.sleep(25);
					int x1 = (int)(250 + 15 * i * Math.sin(i));
					int y1 = (int)(250 + 15 * i * Math.cos(i));
					int x2 = (int)(250 + 15 * (i + .1) * Math.sin(i + .1));
					int y2 = (int)(250 + 15 * (i + .1) * Math.cos(i + .1));
					g.drawLine(x1, y1, x2, y2);
				}
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}