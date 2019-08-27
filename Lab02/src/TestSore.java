
public class TestSore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Vaibhav", "1", 10000.0);
		
		Item i1 = new Item("Bottle", "1", 1, 500.0);
		Item i2 = new Item("Cloth", "2", 1, 750.0);
		
		c1.buyItem(i1);
		c1.buyItem(i2);
	}

}
