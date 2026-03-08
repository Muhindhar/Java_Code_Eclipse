package Handson6;
interface Movable{
	void moveUp();
	void moveDown ();
	void moveLeft();
	void moveRight();	 
}
class MovablePoint implements Movable{
	int x;	
	int y;
	int xspeed;
	int yspeed;
	
	public MovablePoint(int x, int y, int xspeed, int yspeed) {
		super();
		this.x = x;
		this.y = y;
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}
	public void moveUp() {
		 y = y - yspeed;
	}
	public void moveDown() {
		y = y+yspeed;
	}
	public void moveLeft() {
		x = x-xspeed;
	}
	public void moveRight() {
		x = x+xspeed;
	}
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xspeed=" + xspeed + ", yspeed=" + yspeed + "]";
	}	
}


class MovableCircle implements Movable{
	int radius;
	 MovablePoint center;

	 public MovableCircle(int x, int y, int xspeed, int yspeed, int radius, MovablePoint center) {
		super();
	
		this.radius = radius;
	 }
	 public void moveUp() {
	        center.moveUp();
	    }

	    public void moveDown() {
	        center.moveDown();
	    }

	    public void moveLeft() {
	        center.moveLeft();
	    }

	    public void moveRight() {
	        center.moveRight();
	    }
	    public String toString() {
	        return center.toString() + ", radius=" + radius;
	    }

}

public class TestMovable {
	public static void main(String[] args) {

        MovablePoint p = new MovablePoint(5,5,2,3);

        System.out.println("Before Move: " + p);

        p.moveRight();
        p.moveDown();

        System.out.println("After Move: " + p);

        MovableCircle c = new MovableCircle(10,10,1,1,5,null);

        System.out.println("Circle Before Move: " + c);

        c.moveLeft();
        c.moveUp();

        System.out.println("Circle After Move: " + c);
	}
}
