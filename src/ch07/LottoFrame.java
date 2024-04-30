package ch07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LottoFrame extends JFrame implements ActionListener {

	private JButton button;
	private LottoRandomNumber lottoRandomNumber;
	private boolean isStart = true;
	private int NUMBER_DISTANCE = 50;
	private JLabel backgroundMap;

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto Game");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Game Start");
		lottoRandomNumber = new LottoRandomNumber();

		Icon icon = new ImageIcon("images/background1.jpg");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(700, 600);
		backgroundMap.setLocation(0, 0);
		setResizable(false);

	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		add(backgroundMap);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("그림을 그려라!");
		// 이벤트가 일어나면 그림을 다시 그려라
		isStart = false;

		repaint(); // 이벤트가 일어나는 그림을 다시 그려라 // F5
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Font f1 = new Font("궁서체", Font.BOLD, 40);
		Font f2 = new Font("맑은 고딕", Font.BOLD, 30);
		g.setFont(f1);
		g.setColor(Color.yellow);

		if (isStart) {
			g.drawString("로또 번호를 클릭하시오", 190, 270);
		} else {
			int[] getNumbers = lottoRandomNumber.createNumber();
			for (int i = 0; i < getNumbers.length; i++) {
				g.setFont(f2);
				if (i == 0) {
					g.setColor(Color.blue);
				} else if (i == 1) {
					g.setColor(Color.CYAN);
				} else if (i == 2) {
					g.setColor(Color.gray);
				} else if (i == 3) {
					g.setColor(Color.magenta);
				} else if (i == 4) {
					g.setColor(Color.WHITE);
				} else if (i == 5) {
					g.setColor(Color.GREEN);
				}
				g.drawString(getNumbers[i] + " ", (260 + i * NUMBER_DISTANCE), 260);
			}

//			}
//			g.drawString(getNumbers[1] + " ", 160, 200);
//			g.drawString(getNumbers[2] + " ", 180, 200);
//			g.drawString(getNumbers[3] + " ", 200, 200);
//			g.drawString(getNumbers[4] + " ", 220, 200);
//			g.drawString(getNumbers[5] + " ", 240, 200);			
		}
	}

	public static void main(String[] args) {
		new LottoFrame();
	} // end of main
} // end of class
