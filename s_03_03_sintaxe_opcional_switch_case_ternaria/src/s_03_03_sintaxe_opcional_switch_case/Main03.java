package s_03_03_sintaxe_opcional_switch_case;

public class Main03 {

	public static void main(String[] args) {
		double prince = 400.00;
		double discount;

		if (prince < 200) {
			discount = prince * 0.1;
		} else {
			discount = 0;
		}
		System.out.println(discount);

	}

}
