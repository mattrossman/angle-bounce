import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class AngleBounceDriver {

   public static void main(String[] args){
   
      JFrame window = new JFrame("Physics test");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setLayout(new BorderLayout());
      
      PhysicsPanel bouncePanel = new PhysicsPanel();
      window.add(bouncePanel, BorderLayout.CENTER);
      
      window.setSize(1000,1000);
      window.setVisible(true);
      
      XPoint p1 = new XPoint(20,30);
      XPoint p2 = new XPoint(30,30);
      XPoint p3 = new XPoint(20,20);
      System.out.println(p1.distance(p2,p3));
   }

}