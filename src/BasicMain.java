
public class BasicMain {

	public static void main(String[] args) {

		System.out.println("Hello World");

		int a = 37;
		int b = 56;

		if (a > b) {
			System.out.println("a가 b보다 큽니다");
		} else if (a == b) {
			System.out.println("a와 b가 같습니다");
		} else {
			System.out.println("a가 b보다 작습니다");
		}

		switch (a) {
		case 37: {
			System.out.print("a 는 37 입니다");
			break;
		}
		case 38: {
			System.out.println("a 는 38입니다");
			break;
		}
		}
		
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(i);
		}
	}

}
