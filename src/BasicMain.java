
public class BasicMain {

	public static void main(String[] args) {

		
		BasicMain a = new BasicMain();
		a.casting();
		
		
		// System.out.println("Hello World");
		//
		// int a = 37;
		// int b = 56;
		//
		// //if문
		// if (a > b) {
		// System.out.println("a가 b보다 큽니다");
		// } else if (a == b) {
		// System.out.println("a와 b가 같습니다");
		// } else {
		// System.out.println("a가 b보다 작습니다");
		// }
		//
		// //switch문
		// switch (a) {
		// case 37: {
		// System.out.print("a 는 37 입니다");
		// break;
		// }
		// case 38: {
		// System.out.println("a 는 38입니다");
		// break;
		// }
		// }
		//
		// //for문
		// for(int i = 0 ; i < 100 ; i++){
		// System.out.println(i);
		// }

		// //n(n+1)/2 식을 쓰면 패턴을 통해 나온것이기대문에 하위 for과 같음, 더 빠름
		// long start = 0;
		// long end = 999999999L;
		// // start부터 end 까지 더한 결과값을 출력
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
