import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3C implements ActionListener {

	JFrame frame;
	JButton button;

	public static void main(String[] args) {

		SimpleGui3C gui = new SimpleGui3C();
		gui.go();

	}

	public void go() {

		frame = new JFrame("Gradient colors");
		button = new JButton("Change colors");

		button.addActionListener(this);

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setResizable(false);
		
	}

	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}

}