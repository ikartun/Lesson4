package by.epam.tr.lesson4;

public class Task3 {

	public static void main(String[] args) {
		Task3 task = new Task3();
		Student student1 = task.new Student(new int[] {2, 3, 4, 5, 4});
		Student student2 = task.new Student(new int[] {5, 5, 5, 5, 5});
		Student student3 = task.new Student(new int[] {2, 2, 2, 2, 2});
		Group group = task.new Group(new Student[] {student1, student2, student3});
		task.getAvgMarkGroup(group);
		task.getAvgMarkStudent(group);
		task.getCountAchiever(group);
		task.getCountBotcher(group);
	}
	
	public class Student {
		private int[] marks;
		private static final int achieverMark = 5;
		private static final int botcherMark = 2;

		public Student(int[] marks) {
			super();
			this.marks = marks;
		}
	}
	
	public class Group {
		private Student[] students;

		public Group(Student[] students) {
			this.students = students;
		}
	}
	
	public void getAvgMarkGroup(Group group) {
		int totalMark = 0;
		int countMark = 0;
		double avgMark = 0d;
		
		for (int i = 0; i < group.students.length; i++) {
			for (int j = 0; j < group.students[i].marks.length; j++) {
				totalMark += group.students[i].marks[j];
				countMark++;
			}
		}
		
		avgMark = totalMark* 1.0/countMark;		
		System.out.println("Average mark for group is " + avgMark);
	}
	
	public void getAvgMarkStudent(Group group) {
		int totalMark = 0;
		int countMark = 0;
		double avgMark = 0d;
		
		for (int i = 0; i < group.students.length; i++) {
			for (int j = 0; j < group.students[i].marks.length; j++) {
				totalMark += group.students[i].marks[j];
				countMark++;
			}
			avgMark = totalMark* 1.0/countMark;			
			System.out.println("Average mark for student" + i + " is " + avgMark);
			totalMark = 0;
			countMark = 0;
		}		
	}
	
	public void getCountAchiever(Group group) {
		int count = 0;
		boolean isNextMarkAchieve;
		
		for (int i = 0; i < group.students.length; i++) {
			isNextMarkAchieve = true;
			for (int j = 0; j < group.students[i].marks.length; j++) {
				if (group.students[i].marks[j] != Student.achieverMark) {
					isNextMarkAchieve = false;
					break;
				}
			}
			if (isNextMarkAchieve) {
				count++;
			}
		}
		System.out.println("Count of achievers is " + count);
	}
	
	public void getCountBotcher(Group group) {
		int count = 0;
		
		for (int i = 0; i < group.students.length; i++) {
			for (int j = 0; j < group.students[i].marks.length; j++) {
				if (group.students[i].marks[j] == Student.botcherMark) {
					count++;
					break;
				}
			}
		}
		System.out.println("Count of botchers is " + count);
	}

}
