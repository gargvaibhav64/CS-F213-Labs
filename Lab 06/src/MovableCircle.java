
public class MovableCircle implements Movable, Comparable<MovableCircle> {
	

	private MovablePoint center;
	private int radius;
	
	public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;

	}
	
	@Override
	public int compareTo(MovableCircle c){
		return this.radius - c.radius;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.y -= center.ySpeed;

	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.y += center.ySpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.x += center.xSpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.x -= center.xSpeed;
	}

}
