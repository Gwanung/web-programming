package quiz;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz1  extends JFrame{
	JPanel panel;
	JButton button[];
	JTextField text;
	private String[] labels = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
public Quiz1() {
	panel = new JPanel();
	text = new JTextField(25);
	panel.setLayout(new GridLayout(0, 3, 1, 1));
	button = new JButton[9];
	text.setText("123456789");
	
	int index = 0;
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			button[index] = new JButton(labels[index]);
			panel.add(button[index]);
			button[index].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String ac = e.getActionCommand();
					text.setText(text.getText() + ac);
				}
			});
			index++;
		}
	}
	
	
	add(text, BorderLayout.NORTH);
	add(panel, BorderLayout.CENTER);
	setTitle("키패드");
	setVisible(true);	
	setSize(500, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

public static void main(String[] args) {
	new Quiz1();
	
}

}
