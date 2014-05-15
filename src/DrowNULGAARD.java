
public class DrowNULGAARD {
	static char fild = '#';
	static char[][] arr = new char[85][30];
	
	public static void printName(){
		
		for (int i = 0; i < 30; i++) {
			
			for (int j = 0; j < 85; j++) {
				arr[j][i] = '\0'; 
				System.out.println(arr[j][i]);
			}
			System.out.println();
		}
		
		arr[20][10] = fild;
		System.out.println(arr[20][10]);
	}
}
