package project.shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball
{
   double x, y;
   double radius;
   Color color;
   double xStep, yStep;
   
   public Ball( double x, double y, double r, Color c, double xStep, double yStep)
   {
      this.x = x;
      this.y = y;
      this.radius = r;
      this.color = c;
      this.xStep = xStep;
      this.yStep = yStep;
   }
   public void update(int w, int h)
   {
      x = x + xStep;
      y = y + yStep;
      if( x + radius > w || x < radius )
      {
         xStep = -xStep;
      }
      if( y + radius > h || y < radius )
      {
         yStep = -yStep;
      }
   }
   public void draw( Graphics2D g2 )
   {
      g2.setColor( color );
      g2.fillOval( (int)(x-radius), (int)(y-radius), (int)(radius*2), (int)(radius*2) ); 
   }
}