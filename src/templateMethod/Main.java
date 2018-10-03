package templateMethod;
public class Main {

	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		Cha cha = new Cha();
		
		System.out.println("--- CAFE ---");
		cafe.prepareRecipe();
		
		System.out.println("\n--- CHA ---");
		cha.prepareRecipe();
	}

}
