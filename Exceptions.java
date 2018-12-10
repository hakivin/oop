import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;

public class Exceptions {
static int lives = 3;
static boolean win = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Selamat datang di Brain Challange");
		System.out.println("Rules\n1. Challange ini terdiri dari 5 soal.\n2. Diberikan 3 nyawa. Nyawa akan berkurang ketika jawaban salah."
				+ "\n3. Jika jawaban salah, maka anda akan kembali ke level 1." 
				+ "\n4. Apabila terdapat kesalahan dalam memasukkan jawaban (bukan jawaban yang salah), \nmaka anda otomatis akan kalah\nJadi pahami soal baik baik");

		Scanner n = new Scanner(System.in);
		
		while(win == false) {
			if(lives == 0) {
				System.out.println("\n=======GAME OVER========");					
				break;
			}
			try {
				number1(n);
			}		
			catch (InputMismatchException e) {
			lives = 0;
			}
		}
			
	}

	private static void number1(Scanner n) {
		try {
			System.out.println();
			System.out.println("LIVES = " + lives);
			System.out.println("1. Masukkan kapasitas array sehingga array tersebut tidak dapat diisi");
			System.out.print("Jawab: "); int jawab = n.nextInt();
			int[] arr = new int[jawab];
			lives--;
		}
		catch (NegativeArraySizeException e) {
			number2(n);
		}
	}
	
	private static void number2(Scanner n) {
		try { 
			System.out.println();
			System.out.println("LIVES = " + lives);
			String string = "qwertyuiopasdfghjklzxcvbnm";
            String B = "qwertyuiopasdfghjklzxcvbn";			
			System.out.println("2. Terdapat 26 huruf alfabet. Jika B ingin memasukkan 25 huruf urut berdasarkan urutan keyboard qwerty,"
					+ "\nmaka huruf apa yang tidak ada?");
			System.out.print("Jawab: "); String a = n.next();
            B.charAt(string.indexOf(a)); 
            lives--;
        } catch(StringIndexOutOfBoundsException e) { 
            number3(n);
        } 
	}
	
	private static void number3(Scanner n) {
		try {
			System.out.println();
			System.out.println("LIVES = " + lives);
			System.out.println("3. Masukkan suatu angka yang tidak dapat dilakukan operasi matematika");
			System.out.print("Jawab: "); String jawab = n.next();
			Integer.parseInt(jawab);
			lives--;
		}
		catch(NumberFormatException e) {
			number4(n);
		}
	}
	
	private static void number4(Scanner n) {
		try {
			System.out.println();
			System.out.println("LIVES = " + lives);
			System.out.println("4. Berikan contoh penulisan regex,\t\t\t\t\t\t\t\t\t\t\tyang salah");
			System.out.print("Jawab: "); String jawab = n.next();
			Pattern pattern = Pattern.compile(jawab);
			lives--;
		}
		catch (PatternSyntaxException e) {
			number5(n);
		}
	}
	
	private static void number5(Scanner n) {
		try {			
			System.out.println();
			System.out.println("LIVES = " + lives);
			System.out.println("5. Terdapat array berisi String dan berkapasitas 250."
					+ "\nSetiap kelipatan dari 3, indeks akan ditandai."
					+ "\nSetiap kelipatan dari 7, indeks akan ditandai."
					+ "\nSetiap kelipatan dari 11, indeks akan ditandai."
					+ "\nIndeks yang memiliki 3 tanda akan menjadi kosong."
					+ "\nIndeks berapakah pada array tersebut yang kosong/tidak memiliki nilai?");
			String[] arr = new String[250];
			for(int z = 0; z < arr.length; z++) {
				arr[z] = "z";
			}
			for(int a = 3; a < arr.length; a += 3) {
				arr[a] = "a";
			}
			for(int b = 7; b < arr.length; b += 7) {
				if(arr[b].equals("a"))
					arr[b] = "ab";
			}
			for(int c = 11; c < arr.length; c += 11) {
				if(arr[c].equals("ab"))
					arr[c] = null;
			}
			System.out.print("Jawab: "); String e = arr[n.nextInt()];
			e.charAt(0);
			lives--;
		}
		catch(NullPointerException e) {
			win = true;
			System.out.println("\nCongratulations. You win!!!");
		} 
	}

}
