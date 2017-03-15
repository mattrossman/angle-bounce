import java.awt.Point;

public class Ball {
   private double x;
   private double y;
   private double velX;
   private double velY;
   private int diameter;
   
   public Ball(double x, double y, double vx, double vy, int d){
      this.x = x;
      this.y = y;
      velX = vx;
      velY = vy;
      diameter = d;
   }
   public int getIntX(){return (int) x; }
   public int getIntY(){return (int) y; }
   public double getX(){return x; }
   public double getY(){return y; }
   public double getVelX(){ return velX; }
   public double getVelY(){ return velY; }
   public void setVelX(double vx){velX = vx; }
   public void setVelY(double vy){velY = vy; }
   public int getDiameter(){ return diameter; }
   
   public void moveStep(){
      x = x+(int)velX;
      y = y+(int)velY;
   }   
   
   public double distance(Point a, Point b){
   
      double x0 = this.getX();
      double y0 = this.getY();
      double x1 = a.getX();
      double y1 = a.getY();
      double x2 = b.getX();
      double y2 = b.getY();
        
      // numerator
      double num = Math.abs((x2-x1)*(y1-y0) - (x1-x0)*(y2-y1));
      
      // denominator
      double den = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
      
      return (num/den);
   
   }

}