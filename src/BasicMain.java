
public class BasicMain {

	public static void main(String[] args) {

		
		BasicMain a = new BasicMain();
		a.casting();
		
		
		// System.out.println("Hello World");
		//
		// int a = 37;
		// int b = 56;
		//
		// //if��
		// if (a > b) {
		// System.out.println("a�� b���� Ů�ϴ�");
		// } else if (a == b) {
		// System.out.println("a�� b�� �����ϴ�");
		// } else {
		// System.out.println("a�� b���� �۽��ϴ�");
		// }
		//
		// //switch��
		// switch (a) {
		// case 37: {
		// System.out.print("a �� 37 �Դϴ�");
		// break;
		// }
		// case 38: {
		// System.out.println("a �� 38�Դϴ�");
		// break;
		// }
		// }
		//
		// //for��
		// for(int i = 0 ; i < 100 ; i++){
		// System.out.println(i);
		// }

		// //n(n+1)/2 ���� ���� ������ ���� ���°��̱�빮�� ���� for�� ����, �� ����
		// long start = 0;
		// long end = 999999999L;
		// // start���� end ���� ���� ������� ���
		// long result = 0;
		// for(; start <= end ; start++){
		// result = result + start;
		// }
		// System.out.println(result);
		//
		//
	}

	public void casting() {
		String num = "1000.342";
		int number = 1000;
		
		Double dbl = Double.parseDouble(num);
		
		System.out.println(number + dbl);

	}

}
