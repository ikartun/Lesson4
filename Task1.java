package by.epam.tr.lesson4;

import java.util.Date;
import java.util.GregorianCalendar;

public class Task1 {

	public static void main(String[] args) {
		Task1 task1 = new Task1();
		
		Student student = task1.new Student(1, "Petrov", "Petr", "Petrovich", new GregorianCalendar(1999, 2, 22).getTime(), "Wall st. 20", "111111", "engineering", 1);
		student.getStudentByFacultyAndCource("engineering", 1);
		
		Customer customer = task1.new Customer(2, "Ivanov", "Ivan", "Ivanovich", "Wall st. 2", 222222222, 1234567890);
		customer.getCustomerByAccountNumAndCardNum(1234567890, 222222222);
	}
	
	public class Student {// один класс - один файл
		// не нужно без необходимости вкладывать слассы в классы
		private int id;
		private String lastName;
		private String firstName;
		private String middleName;
		private Date dob;
		private String address;
		private String phone;
		private String faculty;
		private int cource;
		
		public Student(int id, String lastName, String firstName, String middleName, Date dob, String address, String phone, String faculty, int cource) {
			this.id = id;
			this.lastName = lastName;
			this.firstName = firstName;
			this.middleName = middleName;
			this.dob = dob;
			this.address = address;
			this.phone = phone;
			this.faculty = faculty;
			this.cource = cource;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getFaculty() {
			return faculty;
		}

		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}

		public int getCource() {
			return cource;
		}

		public void setCource(int cource) {
			this.cource = cource;
		}
		
		public void show() {
			System.out.println("Student's attributes are: ");
			System.out.println("id: " + id);
			System.out.println("lastName: " + lastName);
			System.out.println("firstName: " + firstName);
			System.out.println("middleName: " + middleName);
			System.out.println("dob: " + dob);
			System.out.println("address: " + address);
			System.out.println("phone: " + phone);
			System.out.println("faculty: " + faculty);
			System.out.println("cource: " + cource);
		}
		
		public void getStudentByFacultyAndCource(String faculty, int cource) {
			if (this.faculty.equals(faculty) && this.cource == cource) {
				System.out.println("The student has the same faculty and cource");
				show();
			}
			else {
				System.out.println("The student has not such faculty and cource. Try to find another student.");
			}
		}
	}
	
	public class Customer {
		private int id;
		private String lastName;
		private String firstName;
		private String middleName;
		private String address;
		private int cardNum;
		private int accountNum;
		
		public Customer(int id, String lastName, String firstName, String middleName, String address, int cardNum, int accountNum) {
			this.id = id;
			this.lastName = lastName;
			this.firstName = firstName;
			this.middleName = middleName;
			this.address = address;
			this.cardNum = cardNum;
			this.accountNum = accountNum;
		}		
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getCardNum() {
			return cardNum;
		}

		public void setCardNum(int cardNum) {
			this.cardNum = cardNum;
		}

		public int getAccountNum() {
			return accountNum;
		}

		public void setAccountNum(int accountNum) {
			this.accountNum = accountNum;
		}

		public void show() {
			System.out.println("Customer's attributes are: ");
			System.out.println("id: " + id);
			System.out.println("lastName: " + lastName);
			System.out.println("firstName: " + firstName);
			System.out.println("middleName: " + middleName);
			System.out.println("address: " + address);
			System.out.println("cardNum: " + cardNum);
			System.out.println("accountNum: " + accountNum);
		}
		
		public void getCustomerByAccountNumAndCardNum(int accountNum, int cardNum) {
			if (this.accountNum == accountNum && this.cardNum == cardNum) {
				System.out.println("The customer has the same accountNum and cardNum");
				show();
			}
			else {
				System.out.println("The customer has not such accountNum and cardNum. Try to find another customer.");
			}
		}
		
		
		
		
	}

}
