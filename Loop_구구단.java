import java.util.Scanner;

public class Loop_구구단 {
	
	// 구구단 : void gugudan(){}
	static void gugudan(){
		for(int dan=2; dan<=9; dan++) {
			System.out.println("\n"+ dan+"단");
			for(int j=1; j<=9;j++) {
				System.out.print(dan+ "*" + j + "=" + dan*j +'\t');
			}
			
		}
		System.out.println();
	}
	
	//구구단 2: void gugudan(int dan){}
	static void gugudan(int dan){
		for(int j=1; j<=9;j++) {
			System.out.print(dan+ "*" + j + "=" + dan*j +'\t');
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		gugudan(); //구구단 2단부터 9단까지 출력
		
		//단(dan)을 입력 받아서 해당하는 단의 구구단 출력
		System.out.print("정수(2~9)로 단을 입력 : ");
		int dan = scan.nextInt();
		gugudan(dan);
	}

}
