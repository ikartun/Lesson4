package by.epam.tr.lesson4;

import java.util.Arrays;
import java.util.Comparator;

public class Task4 {

	public static void main(String[] args) {
		Task4 task = new Task4();
		Abiturient abiturient1 = task.new Abiturient(new int[] {2, 3, 4, 5, 4}, "abiturient1"); // avgMark = 3.6
		Abiturient abiturient2 = task.new Abiturient(new int[] {5, 5, 5, 5, 5}, "abiturient2"); // avgMark = 5
		Abiturient abiturient3 = task.new Abiturient(new int[] {2, 2, 2, 2, 2}, "abiturient3"); // avgMark = 2
		Abiturient abiturient4 = task.new Abiturient(new int[] {4, 5, 3, 2, 5}, "abiturient4"); // avgMark = 3.8
		Abiturient abiturient5 = task.new Abiturient(new int[] {4, 4, 4, 4, 5}, "abiturient5"); // avgMark = 4.2
		Abiturient[] abiturients = new Abiturient[] {abiturient1, abiturient2, abiturient3, abiturient4, abiturient5};
		task.printJoinedAbiturient(3, abiturients);
	}
	
	public class Abiturient {
		private int[] marks;
		private String name;

		public Abiturient(int[] marks, String name) {
			this.marks = marks;
			this.name = name;
		}
	}
	
	public void printJoinedAbiturient(int countPlaces, Abiturient[] abiturients) {
		if (countPlaces >= abiturients.length) {
			System.out.println("All abiturients are joined in the University!");
		}
		else {
			Abiturient[] joinedAbiturients = new Abiturient[countPlaces];
			
			Arrays.sort(abiturients, new Comparator<Abiturient>() {
				@Override
				public int compare(Abiturient o1, Abiturient o2) {
					if (((Double) getAvgMark(o1)).compareTo((Double) getAvgMark(o2)) == 0) {
						// if there is the same average mark for 2 abiturients - use additional criteria (random here)
						return (int) (Math.random()*100) - (int) (Math.random()*100);
					}
					else {
						return ((Double) getAvgMark(o2)).compareTo((Double) getAvgMark(o1));
					}
				}
			});
			
			System.out.println("Joined abiturients are: ");
			
			for (int i = 0; i < countPlaces; i++) {
				joinedAbiturients[i] = abiturients[i];
				System.out.print(joinedAbiturients[i].name + " ");
			}
		}
	}
	
	private double getAvgMark(Abiturient abiturient) {
		int totalMark = 0;
		int countMark = 0;
		double avgMark = 0d;
		
		for (int i = 0; i < abiturient.marks.length; i++) {
			totalMark += abiturient.marks[i];
			countMark++;
		}
		avgMark = totalMark* 1.0/countMark;
		
		return avgMark;
	}

}
