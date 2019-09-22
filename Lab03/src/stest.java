class stest { 
	private static String[] Str;
	static { 
		System.out.println("1.%");    
		} 
	public static void main(String[] args) {      
		System.out.println("2.@");    
		}
	static {        
		System.out.println("3.&");    
		}
	static { 
		stest.main(Str);
		test.main(Str);
        System.out.println("4.~");   
    }
	static
	{      
        System.out.println("5.$");  
    }
}