public class FizzBuzz{

	static String fizzbuzz(int i) {
		String str = String.valueOf(i);
		str = i % 3 == 0 ? "Fizz" : str;
		str = i % 5 == 0 ? "Buzz" : str;
		str = i % 5 == 0 && i % 3 == 0 ? "Fizz Buzz" : str;
		return str;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++){
			System.out.println(fizzbuzz(i));
		}
	}

}
