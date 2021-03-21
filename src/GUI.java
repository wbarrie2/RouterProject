import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener
{	
	boolean flip = true;
	JFrame frame;
	JPanel panel;
	JPanel otherPanel;
	JButton button;
	JLabel label;
	JTextField input;
	
	ImageIcon mainRouterImg;
	ImageIcon interfaceImg;
	ImageIcon routerImg;
	ImageIcon pcImg;
	
	JLabel picLabel;
	JLabel picLabel2;
	JLabel picLabel3;
	
	public GUI() throws IOException 
	{
		frame = new JFrame();
		panel = new JPanel();
		otherPanel = new JPanel();
		button = new JButton();
		label = new JLabel();
		input = new JTextField();
		
		mainRouterImg = new ImageIcon(ImageIO.read(new File("MainRouter.png")));
		interfaceImg = new ImageIcon(ImageIO.read(new File("Interface.png")));
		routerImg = new ImageIcon(ImageIO.read(new File("Router.png")));
		pcImg = new ImageIcon(ImageIO.read(new File("PC.png")));
		
		picLabel = new JLabel(pcImg);
		picLabel2 = new JLabel(mainRouterImg);
		picLabel3 = new JLabel(routerImg);
		
		button.setText("Send Data");
		label.setText("Enter IP:");
		input.setText("135.46.56.0");
		
		button.addActionListener(this);
		
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
		panel.setLayout(new GridLayout());
		panel.add(label);
		panel.add(input);
		panel.add(button);
		
		otherPanel.setLayout(new GridLayout());
		otherPanel.add(picLabel);
		otherPanel.add(picLabel2);
		otherPanel.add(picLabel3);
		
		frame.add(panel, BorderLayout.PAGE_START);
		frame.add(otherPanel, BorderLayout.PAGE_END);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,100);
		frame.setTitle("Router");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if (flip)
		{
			picLabel2.setIcon(pcImg);
		}
		else
		{
			picLabel2.setIcon(mainRouterImg);
		}
		flip = !flip;
		
	}

}
