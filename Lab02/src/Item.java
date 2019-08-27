public class Item {
	private String itemName;
	private String itemidNo;
	private int itemQuantity;
	private double itemPrice;
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemidNo() {
		return itemidNo;
	}

	public void setItemidNo(String itemidNo) {
		this.itemidNo = itemidNo;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public Item(String name, String idNo, int quantity, double Price){
		this.itemName = name;
		this.itemidNo = idNo;
		this.itemQuantity = quantity;
		this.itemPrice = Price;
	}
	
	public Item(String name, String idNo, int quantity){
		this.itemName = name;
		this.itemidNo = idNo;
		this.itemQuantity = quantity;
		this.itemPrice = 500.0;
	}

	public Item(String itemName, String itemidNo) {
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = 1;
		this.itemPrice = 500.0;
	}

}
