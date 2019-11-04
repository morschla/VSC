// GraphicsLab01st.java
// The AWT Graphics Program
// This is the student, starting version of Graphics Lab 01.

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsLab01 extends JPanel
{

    public void paintComponent(Graphics g)
    {
        // DRAW CUBE
        g.drawLine(100,100,175,175);
        g.drawLine(100,100,300,100);
        g.drawLine(300,100,375,175);
        g.drawLine(375,175,175,175);
        //
        g.drawLine(100,300,175,375);
        g.drawLine(100,300,300,300);
        g.drawLine(300,300,375,375);
        g.drawLine(175,375,375,375);
        //
        g.drawLine(100,100,100,300);
        g.drawLine(175,175,175,375);
        g.drawLine(300,100,300,300);
        g.drawLine(375,175,375,375);
        // DRAW SPHERE
        g.drawOval(187,137,100,200);
        g.drawOval(212,137,50,200);
        g.drawOval(162,137,150,200);
        g.drawOval(137,137,200,200);
        //
        g.drawOval(137,187,200,100);
        g.drawOval(137,212,200,50);
        g.drawOval(137,162,200,150);
        
        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(500,100,200,200);
        g.drawLine(500,200,600,300);
        g.drawLine(500,200,670,130);
        g.drawLine(600,300,670,130);
        g.drawOval(535,170,95,95);
        // DRAW APCS
        g.fillRect(50,450,20,100);
        g.fillRect(90,450,20,100);
        g.fillRect(70,450,20,20);
        g.fillRect(70,490,20,20);
        //
        g.fillRect(130,450,20,100);
        g.fillRect(150,450,40,20);
        g.fillRect(150,490,40,20);
        g.fillRect(170,470,20,20);
        //
        g.fillRect(210,450,20,100);
        g.fillRect(230,450,40,20);
        g.fillRect(230,530,40,20);
        //
        g.fillRect(290,450,60,20);
        g.fillRect(290,470,20,40);
        g.fillRect(310,490,40,20);
        g.fillRect(330,510,20,40);
        g.fillRect(290,530,40,20);
        // DRAW PACMEN FLOWER
        g.fillArc(595,400,70,70,45,270);
        g.fillArc(505,400,70,70,225,270);
        g.fillArc(550,355,70,70,135,270);
        g.fillArc(550,445,70,70,315,270);
    }

    
    public static void main(String[] args){
          JFrame frame = new JFrame("GraphicsLab01");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setBounds(100, 100, 800, 600);
          frame.setContentPane(new GraphicsLab01());
          frame.setVisible(true);

          
        
    }
}
