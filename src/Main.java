import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//�������� ��������, ����� ������ �� ��������� 2 ����� a � b (b > a) � ������� �� ������ ������ ����� �� a �� b, 
		//����� �� ����� �� 3 ��� �������

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