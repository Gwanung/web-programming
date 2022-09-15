package quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFrame extends JFrame implements ActionListener{

	JPanel  down_panel, panel;
	JTextField text1, text2;
	JButton button1, button2;
	
	public TextFrame() {
		panel= new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		down_panel = new JPanel();
		
		text1 = new JTextField(30);
		text2 = new JTextField(30);
		
		
		button1 = new JButton("변환");
		button1.addActionListener(this);
		button2 = new JButton("취소");
		button2.addActionListener(this);
	
		panel.add(text1);
		panel.add(text2);
		down_panel.add(button1);
		down_panel.add(button2);
		
		
		
		add(panel, BorderLayout.CENTER);
		add(down_panel, BorderLayout.SOUTH);
		
		
		
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("텍스트 변환");
		
		
	}
	public static void main(String[] args) {
		new TextFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = text1.getText();
		if(e.getSource() == button1) {
			text2.setText(text.toUpperCase());
			
		}
	}

}
