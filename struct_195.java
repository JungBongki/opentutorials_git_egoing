import java.util.Scanner;

public class struct_195 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.next();
		}
		
		System.out.println("이름 : " + arr[0]);
		System.out.println("전화번호 : " + arr[1]);
		System.out.println("주소 : " + arr[2]);
	}
}
