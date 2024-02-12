
public class FizzBuzz {
	public static void main(String[] args) {
		int contar = 1;
		int fizz = 0;
		int buzz = 0;
		int fizzbuzz = 0;
		while (contar <= 100) {
		if (contar%15 == 0) {
			fizzbuzz += 1;
			System.out.println("FizzBuzz");
		}else if (contar%5 == 0){
			fizz += 1;
			System.out.println("Buzz");
		}else if (contar%3 == 0) {
			buzz += 1;
			System.out.println("Fizz");
		}else
			System.out.println(contar);
		contar +=1;
		}
		System.out.println("En los números comprendidos del 1 al 100 hay:");
		System.out.println(fizz + " números divisibles entre 3");
		System.out.println(buzz + " números divisibles entre 5");
		System.out.println(fizzbuzz + " números divisibles entre 15");
	}
}
