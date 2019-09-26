import java.io.*;

public class Test {
	
	public static Student readStudent()throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Name string: ");
		
		Name name = new Name(br.readLine());
		
		System.out.println("Enter Age: ");
		
		int age = Integer.parseInt(br.readLine());
		
		Student st = new Student(name, age);
		
		return st;
	}

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		
		for ( int i = 0 ; i < 10 ; i++){
			Student temp = readStudent();
			
			StudentList.addStudent(temp);
		}
		
		for (int i = 0 ; i < StudentList.getStudentsWithAge(20).length; i++){
			System.out.println(StudentList.getStudentsWithAge(20)[i].toString());
		}
		
	}

}
