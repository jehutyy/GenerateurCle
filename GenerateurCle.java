public class GenerateurCle {

	public static void main(String[] args) {
		Key cle = new Key(30, false, false);
		Key cle1 = new Key(12, true, false);
		Key cle2 = new Key(30, false, true);
		Key cle3 = new Key(30, true, true);
		System.out.println(cle.toString());
		System.out.println(cle1.toString());
		System.out.println(cle2.toString());
		System.out.println(cle3.toString());
		
		GenerateurCleFrame frame = new GenerateurCleFrame();
		frame.setVisible(true);
	}
}
