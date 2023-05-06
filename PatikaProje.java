import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz : ");
		int num = input.nextInt(), sum = 0;
		
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("Rakamlar toplamı -> " + sum);
	}

}
