package ch02;


import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 내부 클래스를 활용해서 코드를 완성해주세요.
public class PaintFrame extends JFrame {
	
	NowDrawPanel nowDrawPanal;
	
	public PaintFrame() {
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("내부클래스를 활용한 그림 그리는 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nowDrawPanal = new NowDrawPanel();
	}
	
	public void setInitLayout() {
		add(nowDrawPanal);
		setVisible(true);
	}
	
	class NowDrawPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			// 좌측 지붕
			g.drawRect(10, 50, 10, 10);
			g.drawRect(20, 50, 10, 10);
			g.drawRect(30, 50, 10, 10);
			g.drawRect(40, 40, 10, 10);
			g.drawRect(50, 40, 10, 10);
			g.drawRect(60, 40, 10, 10);
			g.drawRect(70, 30, 10, 10);
			g.drawRect(80, 30, 10, 10);
			g.drawRect(90, 30, 10, 10);
			g.drawRect(100, 20, 10, 10);
			g.drawRect(110, 20, 10, 10);
			g.drawRect(120, 20, 10, 10);
			g.drawRect(130, 10, 10, 10);
			g.drawRect(140, 10, 10, 10);
			g.drawRect(150, 10, 10, 10);
			//우측 지붕
			g.drawRect(150, 10, 10, 10);
			g.drawRect(160, 10, 10, 10);
			g.drawRect(170, 10, 10, 10);
			g.drawRect(180, 20, 10, 10);
			g.drawRect(190, 20, 10, 10);
			g.drawRect(200, 20, 10, 10);
			g.drawRect(210, 30, 10, 10);
			g.drawRect(220, 30, 10, 10);
			g.drawRect(230, 30, 10, 10);
			g.drawRect(240, 40, 10, 10);
			g.drawRect(250, 40, 10, 10);
			g.drawRect(260, 40, 10, 10);
			g.drawRect(270, 50, 10, 10);
			g.drawRect(280, 50, 10, 10);
			g.drawRect(290, 50, 10, 10);
			//지붕 지지대
			g.drawRect(10, 60, 10, 10);
			g.drawRect(20, 60, 10, 10);
			g.drawRect(30, 60, 10, 10);
			g.drawRect(40, 60, 10, 10);
			g.drawRect(50, 60, 10, 10);
			g.drawRect(60, 60, 10, 10);
			g.drawRect(70, 60, 10, 10);
			g.drawRect(80, 60, 10, 10);
			g.drawRect(90, 60, 10, 10);
			g.drawRect(100, 60, 10, 10);
			g.drawRect(110, 60, 10, 10);
			g.drawRect(120, 60, 10, 10);
			g.drawRect(130, 60, 10, 10);
			g.drawRect(140, 60, 10, 10);
			g.drawRect(150, 60, 10, 10);
			g.drawRect(160, 60, 10, 10);
			g.drawRect(170, 60, 10, 10);
			g.drawRect(180, 60, 10, 10);
			g.drawRect(190, 60, 10, 10);
			g.drawRect(200, 60, 10, 10);
			g.drawRect(210, 60, 10, 10);
			g.drawRect(220, 60, 10, 10);
			g.drawRect(230, 60, 10, 10);
			g.drawRect(240, 60, 10, 10);
			g.drawRect(250, 60, 10, 10);
			g.drawRect(260, 60, 10, 10);
			g.drawRect(270, 60, 10, 10);
			g.drawRect(280, 60, 10, 10);
			g.drawRect(290, 60, 10, 10);
			
			// 좌측 외벽
			g.drawRect(10, 70, 10, 10);
			g.drawRect(10, 80, 10, 10);
			g.drawRect(10, 90, 10, 10);
			g.drawRect(10, 100, 10, 10);
			g.drawRect(10, 110, 10, 10);
			g.drawRect(10, 120, 10, 10);
			g.drawRect(10, 130, 10, 10);
			g.drawRect(10, 140, 10, 10);
			g.drawRect(10, 150, 10, 10);
			g.drawRect(10, 160, 10, 10);
			g.drawRect(10, 170, 10, 10);
			g.drawRect(10, 180, 10, 10);
			g.drawRect(10, 190, 10, 10);
			g.drawRect(10, 200, 10, 10);
			g.drawRect(10, 210, 10, 10);
			g.drawRect(10, 220, 10, 10);
			g.drawRect(10, 230, 10, 10);
			g.drawRect(10, 240, 10, 10);
			g.drawRect(10, 250, 10, 10);
			
			// 우측 외벽
			g.drawRect(290, 70, 10, 10);
			g.drawRect(290, 80, 10, 10);
			g.drawRect(290, 90, 10, 10);
			g.drawRect(290, 100, 10, 10);
			g.drawRect(290, 110, 10, 10);
			g.drawRect(290, 120, 10, 10);
			g.drawRect(290, 130, 10, 10);
			g.drawRect(290, 140, 10, 10);
			g.drawRect(290, 150, 10, 10);
			g.drawRect(290, 160, 10, 10);
			g.drawRect(290, 170, 10, 10);
			g.drawRect(290, 180, 10, 10);
			g.drawRect(290, 190, 10, 10);
			g.drawRect(290, 200, 10, 10);
			g.drawRect(290, 210, 10, 10);
			g.drawRect(290, 220, 10, 10);
			g.drawRect(290, 230, 10, 10);
			g.drawRect(290, 240, 10, 10);
			g.drawRect(290, 250, 10, 10);
			
			//바닥
			g.drawRect(10, 260, 10, 10);
			g.drawRect(20, 260, 10, 10);
			g.drawRect(30, 260, 10, 10);
			g.drawRect(40, 260, 10, 10);
			g.drawRect(50, 260, 10, 10);
			g.drawRect(60, 260, 10, 10);
			g.drawRect(70, 260, 10, 10);
			g.drawRect(80, 260, 10, 10);
			g.drawRect(90, 260, 10, 10);
			g.drawRect(100, 260, 10, 10);
			g.drawRect(110, 260, 10, 10);
			g.drawRect(120, 260, 10, 10);
			g.drawRect(130, 260, 10, 10);
			g.drawRect(140, 260, 10, 10);
			g.drawRect(150, 260, 10, 10);
			g.drawRect(160, 260, 10, 10);
			g.drawRect(170, 260, 10, 10);
			g.drawRect(180, 260, 10, 10);
			g.drawRect(190, 260, 10, 10);
			g.drawRect(200, 260, 10, 10);
			g.drawRect(210, 260, 10, 10);
			g.drawRect(220, 260, 10, 10);
			g.drawRect(230, 260, 10, 10);
			g.drawRect(240, 260, 10, 10);
			g.drawRect(250, 260, 10, 10);
			g.drawRect(260, 260, 10, 10);
			g.drawRect(270, 260, 10, 10);
			g.drawRect(280, 260, 10, 10);
			g.drawRect(290, 260, 10, 10);
			
			//손잡이 밖
			g.drawRect(290, 110, 10, 10);
			g.drawRect(300, 100, 10, 10);
			g.drawRect(310, 90, 10, 10);
			g.drawRect(320, 80, 10, 10);
			g.drawRect(330, 70, 10, 10);
			g.drawRect(340, 60, 10, 10);
			g.drawRect(350, 50, 10, 10);
			g.drawRect(360, 50, 10, 10);
			g.drawRect(370, 50, 10, 10);
			g.drawRect(380, 50, 10, 10);
			g.drawRect(390, 50, 10, 10);
			//
			g.drawRect(400, 60, 10, 10);
			g.drawRect(400, 70, 10, 10);
			g.drawRect(400, 80, 10, 10);
			g.drawRect(400, 90, 10, 10);
			g.drawRect(400, 100, 10, 10);
			g.drawRect(400, 110, 10, 10);
			g.drawRect(400, 120, 10, 10);
			g.drawRect(400, 130, 10, 10);
			g.drawRect(400, 140, 10, 10);
			g.drawRect(400, 150, 10, 10);
			g.drawRect(400, 160, 10, 10);
			g.drawRect(400, 170, 10, 10);
			g.drawRect(400, 180, 10, 10);
			g.drawRect(400, 190, 10, 10);
			g.drawRect(400, 200, 10, 10);
			g.drawRect(400, 210, 10, 10);
			g.drawRect(400, 220, 10, 10);
			g.drawRect(400, 230, 10, 10);
			g.drawRect(390, 240, 10, 10);
			g.drawRect(380, 240, 10, 10);
			g.drawRect(370, 240, 10, 10);			
			g.drawRect(360, 240, 10, 10);
			g.drawRect(350, 240, 10, 10);
			//
			g.drawRect(340, 230, 10, 10);
			g.drawRect(330, 220, 10, 10);
			g.drawRect(320, 210, 10, 10);
			g.drawRect(310, 200, 10, 10);
			g.drawRect(300, 190, 10, 10);
			
			
			// 손 잡이 안
			
			g.drawRect(300, 130, 10, 10);
			g.drawRect(310, 120, 10, 10);
			g.drawRect(320, 110, 10, 10);
			g.drawRect(330, 100, 10, 10);
			g.drawRect(340, 90, 10, 10);
			g.drawRect(350, 80, 10, 10);
			//
			g.drawRect(360, 70, 10, 10);
			g.drawRect(370, 70, 10, 10);
			g.drawRect(380, 70, 10, 10);
			//
			g.drawRect(380, 80, 10, 10);
			g.drawRect(380, 90, 10, 10);
			g.drawRect(380, 100, 10, 10);
			g.drawRect(380, 110, 10, 10);
			g.drawRect(380, 120, 10, 10);
			g.drawRect(380, 130, 10, 10);
			g.drawRect(380, 140, 10, 10);
			g.drawRect(380, 150, 10, 10);
			g.drawRect(380, 160, 10, 10);
			g.drawRect(380, 170, 10, 10);
			g.drawRect(380, 180, 10, 10);
			g.drawRect(380, 190, 10, 10);
			g.drawRect(380, 200, 10, 10);
			g.drawRect(380, 210, 10, 10);
			g.drawRect(380, 220, 10, 10);
			//
			g.drawRect(370, 220, 10, 10);
			g.drawRect(360, 220, 10, 10);
			//
			g.drawRect(350, 210, 10, 10);
			g.drawRect(340, 200, 10, 10);
			g.drawRect(330, 190, 10, 10);
			g.drawRect(320, 180, 10, 10);			
			g.drawRect(310, 170, 10, 10);
			g.drawRect(300, 160, 10, 10);
			
			g.drawString("스타벅스", 130, 160);
			
			
			
			
			
		}
		
		
	}
	
}
