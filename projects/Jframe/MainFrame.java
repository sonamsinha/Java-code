package project;

import javax.swing.JFrame;


public class MainFrame
{
   JFrame frame;
   DrawPanel panel;
   public MainFrame()
   {
      frame = new JFrame("Graphics Demo");
      frame.setSize(600, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      panel = new DrawPanel();
      frame.add(panel);
      
      frame.setVisible(true);
      panel.startTimer();
   }
   
   public static void main( String[] args )
   {
      MainFrame m = new MainFrame();
   }

}