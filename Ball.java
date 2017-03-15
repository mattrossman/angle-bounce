import java.awt.Point;

public class Ball extends Point{
   
   private double velX;
   private double velY;
   private double diamter;
   
   public Ball(double x, double y, double vx, double vy, double d){
      super();
      velX = vx;
      velY = vy;
      diamter = d;
   }

   public double getVelX(){ return velX; }
   public double getVelY(){ return velY; }
   
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