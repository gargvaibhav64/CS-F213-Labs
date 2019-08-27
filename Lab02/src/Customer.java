class Customer {
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	Customer(String name, String idNo, double balance){
		this.name = name;
		this.balance = balance;
		this.idNo = idNo;
	}
	
	Customer(String name, String idNo){
		this.name = name;
		this.balance = 5000.0;
		this.idNo = idNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public double getBalance() {
		return balance;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void buyItem(Item item){
		double cost = item.getItemPrice() * item.getItemQuantity() ;
		
		if (item.getItemQuantity() <= 0){
			System.out.println("Order is not valid.");
		}
		else if (this.balance > cost){
			this.balance -= cost;
			Print(item);
		}
		else {
			System.out.println("Insufficient Balance!!!");
		}
	}
	
	public void Print(Item item){
		System.out.println("Item name is : " + item.getItemName());
		System.out.println("Item idNo is : " + item.getItemidNo());
		System.out.println("Item Quantity is : " + item.getItemQuantity());
		System.out.println("Item Price is : " + item.getItemPrice());
		System.out.println("Remaining Balance is : " + balance);
		
	}
	
}
