import java.awt.*;
import javax.swing.*;

public class Spiral extends JFrame
{
	public Spiral()
	{
		this.setTitle("Spiral");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().add(new SpiralCanvas());
		this.setVisible(true);
		this.pack();
	}

	public static void main (String[] args)
	{
		new Spiral();
	}
}