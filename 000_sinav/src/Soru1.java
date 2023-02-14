
public class Soru1 {

	public static void ekranaCizdir() {

		int satirSayisi = 7;

		for (int i = 1; i <= satirSayisi; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ekranaCizdir();

	}

}
