import java.io.FileWriter;
import java.io.IOException;

public class Key {
	private String cle;
	private boolean upper = true;
	private boolean digit = true;
	private int size;
	private int[] number = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private Ascii ascii;

	public Key(int size, boolean upper, boolean digit) {
		this.upper = upper;
		this.digit = digit;
		ascii = new Ascii();
		cle = "";
		if (upper == true && digit == true) {
			for (int i = 0; i < size; i++) {
				int upOrloOrnum = (int) (Math.random() * 2);
				if (upOrloOrnum == 0)
					cle += number[(int) (Math.random() * 9)];
				else if (upOrloOrnum == 1) {
					cle += ascii.letter();
				}
			}
		} else if (upper == true) {
			for (int i = 0; i < size; i++) {
				cle += ascii.letter();
			}
		} else if (digit == true) {
			for (int i = 0; i < size; i++) {
				int upOrloOrnum = (int) (Math.random() * 2);
				if (upOrloOrnum == 0)
					cle += number[(int) (Math.random() * 9)];
				else if (upOrloOrnum == 1) {
					cle += ascii.lowerLetter();
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				cle += ascii.lowerLetter();
			}
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isUpper() {
		return upper;
	}

	public boolean isDigit() {
		return digit;
	}

	public String getCle() {
		return this.cle;
	}

	public String toString() {
		return "la cle est " + getCle();
	}

	public void setUpper(boolean upper) {
		this.upper = upper;
	}

	public void setDigit(boolean digit) {
		this.digit = digit;
	}

	public void write() {
		try {
			FileWriter nameFile = new FileWriter("src/cle_courante");
			nameFile.write(this.getCle());
			nameFile.close();
		} catch (IOException e) {
			System.out.println("erreur");
		}
		
		
	}
}
