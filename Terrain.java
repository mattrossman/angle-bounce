import java.awt.Point;
import java.util.ArrayList;

public class Terrain {

   private ArrayList<Point> mesh = new ArrayList<Point>();
   
   public Terrain(){};
   
   public void addPoint(Point p){
      mesh.add(p);
   }
   
   public int[] getXPoints(){
   
      int[] listOfX = new int[mesh.size()];
      
      for (int i=0; i<listOfX.length; ++i)
         listOfX[i] = (int) mesh.get(i).getX();
      
      return listOfX;
   }
   
   public int[] getYPoints(){
   
      int[] listOfY = new int[mesh.size()];
      
      for (int i=0; i<listOfY.length; ++i)
         listOfY[i] = (int) mesh.get(i).getY();
      
      return listOfY;
   }

}