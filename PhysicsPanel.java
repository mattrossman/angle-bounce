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
   
   public void actionPerformed(ActionEvent e){
      step();
   }
   
   public void step(){
   
      collisions();
      
      b.moveStep();
      
      repaint();
   }
   
   private void collisions(){
   
      double nextLeft = b.getX() + b.getVelX();
      double nextRight = nextLeft+b.getDiameter();
      double nextTop = b.getY()+ b.getVelY();
      double nextBottom = nextTop + b.getDiameter();
      
      if (nextBottom >= getHeight()-1 || nextTop <= 0)
         b.setVelY(b.getVelY()*(-1));
      else
         b.setVelY(b.getVelY()+gravity);
            
      if (nextLeft <= 0 || nextRight >= getWidth()-1)
         b.setVelX(b.getVelX()*(-1));
      
   }
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      g.setColor(Color.RED);
      g.fillOval(b.getIntX(),b.getIntY(),b.getDiameter(),b.getDiameter());
      g.setColor(Color.GREEN);
      
   }
}