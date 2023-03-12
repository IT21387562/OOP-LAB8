package ex2;

public class Exercise2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print("Age is : ", 23);
		print("Name is : ", "AmNDI");
	}
	
	public static <E> void print(String msg, E val) {
		System.out.println(msg+" "+val);
	}

}
