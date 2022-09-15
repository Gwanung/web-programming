import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockPaperScissor extends JFrame implements ActionListener{
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;
	
	private JPanel panel;
	private JTextField output, information;
	private JButton rock, paper, scissor;
	
	public RockPaperScissor(){
		setTitle("가위바위보");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		information = new JTextField("아래의 버튼 중에서 하나를 클릭하시오!");
		output = new JTextField(20);
		rock = new JButton("ROCK");
		paper = new JButton("PAPER");
		scissor = new JButton("SCISSOR");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Random r = new Random();
		int c = r.nextInt(3);
		
		if(e.getSource() == rock) {
			if(c == SCISSOR)
				output.setText("승리");
			else if(c == ROCK)
				output.setText("비김");
			else
				output.setText("짐");
		}else if(e.getSource() == paper) {
			if(c == ROCK)
				output.setText("승리");
			else if(c == PAPER)
				output.setText("비김");
			else
				output.setText("짐");	
		}else if(e.getSource() == scissor){
			if(c == PAPER)
				output.setText("승리");
			else if(c == SCISSOR)
				output.setText("비김");
			else
				output.setText("짐");		
		}
	}
	
	public static void main(String[] args) {
		new RockPaperScissor();
	}

	
	

}
