import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TextAreaFrame extends JFrame implements ActionListener {
	
	private JTextField textField;
	private JTextArea textArea;
	
	public TextAreaFrame() {
	
		textField = new JTextField(30);
		textField.addActionListener(this);
		textArea = new JTextArea(10, 30);  //10줄, 30글자
		textArea.setEditable(false); //수정 불가능
		
		
		add(textField, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		
		setTitle("TextArea Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();  //입력하고 나면 다시 입력하기 편하기 위해 입력한 텍스트가 지워짐
	}
	
	public static void main(String[] args) {
		new TextAreaFrame();
	}

}
