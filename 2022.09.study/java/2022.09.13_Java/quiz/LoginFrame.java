package quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoginFrame extends JFrame implements ActionListener{
	
	JPanel p1, p2, p3;
	JLabel email, password;
	JButton button1, button2;
	JTextField text1, text2;
	
	public LoginFrame() {
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 2));
		p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 2));		
		p3 = new JPanel();
		p3.setLayout(new GridLayout(1, 2));
		
		email = new JLabel("이메일");
		text1 = new JTextField(10);
		text1.setText("hong@google.com");
		p1.add(email);
		p1.add(text1);
		
		password = new JLabel("비밀번호");
		text2 = new JTextField(10);
		text2.setText("****");
		p2.add(password);
		p2.add(text2);
		
		button1 = new JButton("로그인");
		button1.addActionListener(this);
		button2 = new JButton("취소");
		button2.addActionListener(this);
		p3.add(button1);
		p3.add(button2);
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		setVisible(true);
		pack();
		setTitle("LOGIN FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
	}
	public static void main(String[] args) {
		new LoginFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String text_e = "hong@google.com";
		String text_p = "****";
 		if(e.getSource() == button1) {
			if(text_e.equals(text1.getText()) && text_p.equals(text2.getText())) {
				JOptionPane.showMessageDialog(null, "정답입니다.");
			}else {
				JOptionPane.showMessageDialog(null, "정답이 아닙니다.");
			}
		}
		if(e.getSource() == button2) {
			System.exit(0);
		}
	}

}
