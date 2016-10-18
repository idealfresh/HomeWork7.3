import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//Напишете програма, която приема от конзолата 2 числа a и b (b > a) и изкарва на екрана всички числа от a до b, 
		//които се делят на 3 без остатък

		Scanner scan = new Scanner(System.in);
		System.out.println("Input firs number: ");
		int a = scan. nextInt();
		System.out.println("Input second number: ");
		int b = scan.nextInt();
		
		if(a>=b){
			System.out.print("First number must be > from secon number ");
		}
	
		for(int i=a;i<=b;i++){
			if(i%3==0){
			System.out.print(i);
		}
	}

}
}