
public class BasicMain {

	public static void main(String[] args) {

		System.out.println("Hello World");

		int a = 37;
		int b = 56;

		if (a > b) {
			System.out.println("a�� b���� Ů�ϴ�");
		} else if (a == b) {
			System.out.println("a�� b�� �����ϴ�");
		} else {
			System.out.println("a�� b���� �۽��ϴ�");
		}

		switch (a) {
		case 37: {
			System.out.print("a �� 37 �Դϴ�");
			break;
		}
		case 38: {
			System.out.println("a �� 38�Դϴ�");
			break;
		}
		}
		
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(i);
		}
	}

}
