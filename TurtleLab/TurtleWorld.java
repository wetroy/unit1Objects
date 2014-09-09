import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle4 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle2.setPenColor(Color.BLUE);
        turtle1.setPenColor(Color.RED);
        turtle3.setPenColor(Color.ORANGE);
        turtle4.setPenColor(Color.MAGENTA);
        Turtle turtle5 = new Turtle(turtleWorld);
        Turtle turtle6 = new Turtle(turtleWorld);
        Turtle turtle7 = new Turtle(turtleWorld);
        Turtle turtle8 = new Turtle(turtleWorld);
        Turtle turtle9 = new Turtle(turtleWorld);
        Turtle turtle10 = new Turtle(turtleWorld);   
        Turtle turtle11 = new Turtle(turtleWorld);
        turtle11.setColor(Color.BLACK);
        Turtle turtle12 = new Turtle(turtleWorld);        
        turtle9.turnRight();
        turtle9.forward(108);
        turtle9.turn(-90);
        turtle9.setPenColor(Color.GREEN);
        turtle9.penDown();
        turtle12.turnLeft();
        turtle12.forward(108);
        turtle12.turn(90);
        turtle12.setPenColor(Color.BLUE);
        turtle12.penDown();        
        turtle10.turnRight();
        turtle10.forward(108);
        turtle10.turn(-90);
        turtle10.setPenColor(Color.BLUE);
        turtle10.setPenWidth(15);
        turtle10.backward(10);
        turtle10.penDown();        
        turtle6.setPenColor(Color.PINK);
        turtle7.setPenColor(Color.YELLOW);
        turtle8.setPenColor(Color.GREEN);
        turtle5.setPenColor(Color.CYAN);        
        turtle1.penDown();
        turtle1.forward(100);
        turtle3.penDown();
        turtle3.backward(100);
        turtle2.penDown();
        turtle4.penDown();
        turtle5.penDown();
        turtle6.penDown();
        turtle7.penDown();
        turtle8.penDown();
        turtle2.turnLeft();
        turtle4.turnRight();
        turtle5.turn(45);
        turtle6.turn(-45);
        turtle7.turn(135);
        turtle8.turn(-135);
        turtle2.backward(100);
        turtle4.backward(100);
        turtle5.backward(50);
        turtle6.backward(50);
        turtle7.backward(50);
        turtle8.backward(50); 
        turtle1.turn(180);
        turtle1.setBodyColor(Color.ORANGE);
        turtle2.setBodyColor(Color.MAGENTA);
        turtle3.setBodyColor(Color.RED);
        turtle4.setBodyColor(Color.BLUE);
        turtle5.setBodyColor(Color.GREEN);
        turtle6.setBodyColor(Color.YELLOW);
        turtle7.setBodyColor(Color.PINK);
        turtle8.setBodyColor(Color.CYAN);
        for (int i = 1; i<300;i++){
            turtle9.forward(580);
            turtle9.turn(-130);
        }
        turtle9.setPenColor(Color.MAGENTA);        
        for (int i = 1; i<300;i++){

            turtle9.forward(580);
            turtle9.turn(-130);
        }   
        turtle9.setPenColor(Color.ORANGE);        
        for (int i = 1; i<300;i++){
            turtle9.forward(580);
            turtle9.turn(-130);
        } 
        for (int i = 1; i<300;i++){
            turtle12.forward(580);
            turtle12.turn(130);
        }
        turtle12.setPenColor(Color.RED);        
        for (int i = 1; i<300;i++){
            turtle12.forward(580);
            turtle12.turn(130);
        }   
        turtle12.setPenColor(Color.CYAN);        
        for (int i = 1; i<300;i++){
            turtle12.forward(580);
            turtle12.turn(130);
        }        
        for (int i = 1; i<37;i++){
            turtle10.forward(20);
            turtle10.turn(-10);
        }
        turtle9.setVisible(false);
        turtle9.penUp();
        turtle12.setVisible(false);
        turtle12.penUp();
        turtle10.setVisible(false);
        turtle10.penUp();        
    }

}
