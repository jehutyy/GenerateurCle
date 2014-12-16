import java.util.ArrayList;

public class Ascii {
	private ArrayList<Character> array;
	private ArrayList<Character> arrayMaj;

	public Ascii() {
		array = new ArrayList<Character>();
		arrayMaj = new ArrayList<Character>();
		char foo = 'a';
		for (int i = 0; i < 26; i++) {
			array.add(foo);
			foo++;
		}
		foo = 'A';
		for (int i = 0; i < 26; i++) {
			arrayMaj.add(foo);
			foo++;
		}
	}

	public char letter() {
		char baz;
		double foo = Math.random();
		int bar = (int) (foo * 100);
		if (bar % 2 == 0)
			baz = array.get((int) (Math.random() * 26));
		else
			baz = arrayMaj.get((int) (Math.random() * 26));
		return baz;
	}

	public char lowerLetter() {
		char baz;
		baz = array.get((int) (Math.random() * 26));
		return baz;
	}

	@Override
	public String toString() {
		return "Ascii [array=" + array + ", arrayMaj=" + arrayMaj + "]";
	}
}
