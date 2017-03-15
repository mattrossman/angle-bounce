import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PhysicsPanel extends JPanel implements ActionListener{
   
   private Terrain ter = new Terrain();
   
   private Ball b = new Ball(500,500,5,0,20);
   private int refresh = 60;
   private double gravity = 45.0/refresh;
   
   public PhysicsPanel(){
   
      setBackground(new Color(200,235,255));
      Timer timer = new Timer(1000/refresh,this);
      timer.start();
   }
   
   public double getGravity() {return gravity; }
   
   public void actionPerformed(ActionEvent e){
      step();
   }
   
   public void step(){
   
      b.collisions(this);
      
      b.moveStep();
      
      repaint();
   }
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      g.setColor(Color.RED);
      g.fillOval(b.getIntX(),b.getIntY(),b.getDiameter(),b.getDiameter());
      g.setColor(Color.GREEN);
      
   }
}