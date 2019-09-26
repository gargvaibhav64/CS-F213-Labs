
public class TestMovable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable ml = new MovableCircle(5,5, 5, 2, 3);
		ml.moveDown();
		System.out.println(ml);
		
		ml.moveRight();
		System.out.println(ml);
	}

}
