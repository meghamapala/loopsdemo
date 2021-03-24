package welcome;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("msg");
		
		for(int i =10; i<15; i++) {
			System.out.println(i);
			//System.out.println("*****");
		}
		
		System.out.println("*****");
		
		int num = 20;
		
		while(num<=30) {
			
			System.out.println(num);
			num++;
		}
		System.out.println("*****");
		
		do {
			System.out.print(num);
			num--;
		}while(num>15);

	}

}
