
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c1 = new Circle(2.3);     
        c1.area(); 
        
        // accessing static method with class name
        c1.getCircumference();  
 
        Circle c2 = new Circle(3.45); 
        c2.area();   
        // accessing static method with references is discouraged  
        c2.getCircumference ();
	}

}
