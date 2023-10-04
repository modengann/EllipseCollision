import processing.core.*;

public class App extends PApplet{
    Ellipse ball1;
    Ellipse ball2;

    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings(){
        size(1600,1000);
    }
    public void setup(){
        ball1 = new Ellipse(this, 100, 100, 75, 75);
        ball2 = new Ellipse(this, 200, 200, 120, 120);
    }

    public void draw(){
        background(190);

        ball2.setX(mouseX);
        ball2.setY(mouseY);

        ball1.display();
        ball2.display();

        if(checkForCollision(ball2, ball1)){
            ball2.setFill(random(255), random(255), random(255));
        }
        
    }

    public boolean checkForCollision(Ellipse b1, Ellipse b2){
        double distanceBetweenCircles = dist(b1.getX(), b1.getY(), b2.getX(), b2.getY());
       if(distanceBetweenCircles <= (b1.getWidth()/2 + b2.getWidth()/2)){
        return true;
       }else{
        return false;
       }

    }

    
}
