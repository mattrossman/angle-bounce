import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PhysicsPanel extends JPanel implements ActionListener{
   
   private Terrain ter = new Terrain();
   
   private Ball b = new Ball(500,200,5,0,20);
   
   private double gravity = 0.75;
   
   public PhysicsPanel(){
   
      setBackground(new Color(200,235,255));
      Timer timer = new Timer(1000/60,this);
      timer.start();
   }
   
   public void actionPerformed(ActionEvent e){
      step();
   }
   
   public void step(){
   
      //collisions();
      
      b.moveStep();
      
      repaint();
   }
   
   private void collisions(){
   /*
      double nextLeft = pos[X]+ vel[X];
      double nextRight = nextLeft+diameter;
      double nextTop = pos[Y]+ vel[Y];
      double nextBottom = nextTop + diameter;
      
      if (nextBottom >= getHeight()-1 || nextTop <= 0)
         vel[Y]*=-1;
      else
         vel[Y]+=gravity;
            
      if (nextLeft <= 0 || nextRight >= getWidth()-1)
         vel[X]*=-1;
         */
   }
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      g.setColor(Color.RED);
      g.fillOval(b.getIntX(),b.getIntY(),b.getDiameter(),b.getDiameter());
      g.setColor(Color.GREEN);
      
   }
}