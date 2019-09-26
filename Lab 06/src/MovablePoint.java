import java.util.Comparator;


public class MovablePoint implements Movable, Comparator<MovablePoint> {
	
	int x, y;
	int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public int compare(MovablePoint m1, MovablePoint m2){
		if(m1.xSpeed > m2.xSpeed)
			return m1.xSpeed - m2.xSpeed;
		else if (m1.ySpeed > m2.ySpeed)
			return m1.ySpeed - m2.ySpeed;
		else
			return 0;
	}

	@Override
	public String toString(){
		return "Point at (" + x + "," + y + ")";
	}

	@Override
	public void moveUp() {
		y-= ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y+= ySpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x+= xSpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x-= xSpeed;
	}

}
