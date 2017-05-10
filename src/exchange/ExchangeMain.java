package exchange;

public class ExchangeMain {

	public static void main(String[] args) {

		ExchangeMain price = new ExchangeMain();
		price.price(6350);

	}

	public void price(int money) {

		int temp = money;
		int units[] = { 5000, 1000, 500, 100, 50, 10 };

		for (int unit : units) {
			temp = money / unit;
			System.out.println(unit + "Àº " + temp + "°³");
			money = money - (temp * unit);
		}

	}
}
