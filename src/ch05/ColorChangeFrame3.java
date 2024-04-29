package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame3 extends JFrame implements ActionListener {

	private JPanel panel1;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private JButton button3;

	public ColorChangeFrame3() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("신호등 컨트롤러");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		panel1 = new JPanel();
		panel1.setBackground(Color.gray);
		panel2 = new JPanel();
		button1 = new JButton("정지");
		button2 = new JButton("대기");
		button3 = new JButton("운행");

	}

	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		panel2.add(button1, BorderLayout.SOUTH);
		panel2.add(button2, BorderLayout.SOUTH);
		panel2.add(button3, BorderLayout.SOUTH);

		setVisible(true);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		// 주소값으로 비교도 가능
		// 문자열 값으로 비교 가능
		JButton selectedButton = (JButton) e.getSource();
		if (selectedButton == this.button1) {
			System.out.println("button1 객체가 눌러졌다라고 판명 가능 ");
			panel1.setBackground(Color.red);
		} else if (selectedButton == this.button2) {
			System.out.println("button2 객체가 눌러졌다라고 판명 가능 ");
			panel1.setBackground(Color.orange);
		} else {
			System.out.println("button3 객체가 눌러졌다라고 판명 가능 ");
			panel1.setBackground(Color.green);
		}
	}

	public static void main(String[] args) {
		new ColorChangeFrame3();
	}

}
