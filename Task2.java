package by.epam.tr.lesson4;

public class Task2 {

	public static void main(String[] args) {
		Task2 task = new Task2();
		Fraction[] fractions = task.getFractionArray(10);
		task.printFractionArray(fractions);
	}
	
	public class Fraction {
		private int numerator;
		private int denominator;
		
		public Fraction() {
			numerator = denominator = 1;
		}
		
		public Fraction(int num, int den) {
			numerator = num;
			denominator = den;
		}
		
		private void reduceFraction() {
			int nod;
			
			if (Math.abs(numerator) < Math.abs(denominator)) {
				nod = Math.abs(numerator);
			}
			else {
				nod = Math.abs(denominator);
			}
			
			while (true) {
				if (((numerator % nod) == 0) && ((denominator % nod) == 0))// куда пропали { }
					break;
				nod--;
			}
			
			numerator = numerator / nod;
			denominator = denominator / nod;
			}
		
		public void printFraction() {
			System.out.print(numerator + "/" + denominator);
		}
	}
	
	public Fraction[] getFractionArray(int k) {
		Fraction[] array = new Fraction[k];
		
		System.out.println("Getting new random array of not redused fractions: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = new Fraction((int) (Math.random()*100), (int) (Math.random()*100));
			array[i].printFraction();
			System.out.print(" ");
		}
		
		return array;
	}
	
	public void printFractionArray(Fraction[] array) {
		
		System.out.println("\nPrinting the array of redused fractions: ");
		for (int i = 0; i < array.length; i++) {
			array[i].reduceFraction();
			array[i].printFraction();
			System.out.print(" ");
		}
	}

}
