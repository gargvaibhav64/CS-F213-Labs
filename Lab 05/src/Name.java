import java.util.*;


public class Name {
	private String fname;
	private String mname;
	private String lname;
	
	Name(String name){
		StringTokenizer st = new StringTokenizer(name, ";,");
		StringTokenizer stcopy = new StringTokenizer(name, ";,", true);
		
		String temp = stcopy.nextToken();
		
		if(stcopy.nextToken().equals(",")){
			fname = st.nextToken();
			mname = st.nextToken();
			lname = st.nextToken();
		}
		else{
			lname = st.nextToken();
			mname = st.nextToken();
			fname = st.nextToken();
		}

	}

	
	public String getName() {
		return fname + " " + mname + " " + lname;
	}

	@Override
	public String toString() {
		return fname + mname + lname;
	}
	
	
}
