package cup;

import java.applet.Applet;
import java.awt.*;
import java.applet.*;

public class coffee_cup extends Applet {

    Color brown = new Color(150,75,0);
    Color purple = new Color(128,0,128);
    Color maroon = new Color(0,0,128);
    public void init(){
        //this.setBackground(Color.yellow);
    }
    
    public void paint(Graphics g) {
       
        g.setColor(brown);
        Graphics2D g2 = (Graphics2D) g;
        
        
        g.fillOval(200, 170, 300,70);
        g.drawArc(170, 200, 80, 300, 90, 180);
        g.drawArc(450, 200, 80, 300, 90, -180);
        g.drawArc(200, 473, 300, 40, 180, 180);
        g2.setStroke(new BasicStroke(5));
        g.drawArc(504, 250, 100, 180,240,245);
        
        g.setColor(purple);
        int[] x = {350,380,350,320};
        int[] y = {260,290,320,290};
        int l = x.length;
        g.fillPolygon(x,y,l);
        
        g.setColor(Color.red);
        int[] x1 = {385,415,385,355};
        int[] y1 = {295,325,350,325};
        int l1 = x1.length;
        g.fillPolygon(x1,y1,l1);
        
        g.setColor(Color.orange);
        int[] x2 = {315,345,315,285};
        int[] y2 = {295,325,350,325};
        int l2 = x2.length;
        g.fillPolygon(x2,y2,l2);
        
        g.setColor(maroon);
        int[] x3 = {350,380,350,320};
        int[] y3 = {330,355,380,355};
        int l3 = x3.length;
        g.fillPolygon(x3,y3,l3);
        //g.drawArc(500, 300, 100, 200, 90, -180);
        //g.drawLine(207, 500, 490, 500);
        /*
        g.fillOval(200, 170, 250,70);
        int[] x = {250,200,450,400};
        int[] y = {400,200,200,400};
        int l = x.length;
        g.drawPolygon(x,y,l);
        g.drawArc(390, 200, 100, 150,240,200);
        
        
        g2.setStroke(new BasicStroke(10));
        g.drawLine(800,100,800,500);
        g.drawArc(675, 100, 250, 175, -90, 180);
        g.drawLine(800,275,950,480);
        */
        
        
        
        
    }
    
}
