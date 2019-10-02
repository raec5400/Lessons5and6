package Lesson5;

import java.awt.Color;
import java.awt.Graphics;

public class Face {
    private int xPos, yPos, diameter;
    private Color color, eyecol;
    private Graphics g;
    
    public Face(Graphics g, int x, int y){
        xPos=x;
        yPos=y;
        this.g = g; //"g" property = "g" param
        //default size and color
        diameter=100;
        color=Color.red;
    }
    
    public void setColor(Color newface, Color neweyes){
        color = newface;
        eyecol = neweyes;
    }
    
    public void draw(){
        
    }
    private void drawHead(){
        g.fillOval(xPos, yPos, 25, 25);
    }
    private void drawEyes(){
        g.fillOval(xPos, yPos, 5, 5);
        g.fillOval(xPos, yPos, 5, 5);
    }
}
