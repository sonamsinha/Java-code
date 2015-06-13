package project;

import javax.swing.JPanel; 
import java.awt.Color;
import project.shapes.Ball;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import project.collections.LinkedList;

import javax.swing.Timer;



public class DrawPanel extends JPanel implements ActionListener
{
   Timer t;
   LinkedList<Ball> objList;
   Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.BLUE, Color.GREEN, Color.WHITE, Color.BLACK};  
   public DrawPanel()
   {
      setBackground( new Color(255, 128, 128) );
      objList = new LinkedList<>();
      //setVisibility(true);
      t = new Timer(20, this );
      for( int i=0; i<50; i++ ) 
      {
         Ball ball = new Ball( 400 - Math.random() * 200, 400 - Math.random() * 200, 20 + Math.random() * 30, colors[(int)(Math.random() * colors.length)], 10.0 - Math.random() * 20, 10.0 - Math.random() * 20 );
         objList.add(ball);
      }      
   }
   
   public static void main(String[] args)
   {
      MainFrame.main(args);
   }
   
   public void paint(Graphics g)
   {
      paintComponent(g);
      System.out.println( "In paint!");
      Graphics2D g2 = (Graphics2D)g;
      int w = (int)(getSize().getWidth());
      int h = (int)(getSize().getHeight());
      for( int i=0; i<objList.size(); i++ )
      {
         Ball b = objList.get(i); 
         b.update(w, h);
         b.draw(g2);
      }
   }
   public void startTimer()
   {
      t.start();
   }
   public void actionPerformed(ActionEvent ae)
   {
      //System.out.println( "Timer event!" );
      repaint();
   }
}