import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

//Student class to encapsulate student data
class Student {
	private String name;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}

//Main class for student management system
public class StudentManagement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();

		String choice = "5";
		System.out.println("\nOPTIONs\n\t1. Add a new student."
				+ "\n\t2. Remove a student by name."
				+ "\n\t3. Display all students with their grades."
				+ "\n\t4. Calculate and display the average grade of the students"
				+ "\n\t5. Exit");
		
		// Main loop to display menu and handle user choices
		do {
			System.out.print("\nEnter your choice : ");
			choice = sc.nextLine();// Read user choice
			
			switch (choice) {
			case "1": // Option to add a new student
				Student stu = new Student();

				System.out.print("\tEnter new student name: ");
				stu.setName(sc.nextLine());

				System.out.print("\tEnter grade of the Student: ");
				stu.setGrade(sc.nextInt());
				sc.nextLine(); // Consume newline after nextInt()

				students.add(stu);
				System.out.println("\n\tStudent <" + stu.getName() + "> added successfully");
				break;
			case "2": // Option to remove a student by name
				System.out.print("Enter student name to remove: ");
				String studentName = sc.nextLine();
				boolean flag = false;
				for (Student student : students) {
					if (studentName.equalsIgnoreCase(student.getName())) {
						students.remove(students.indexOf(student));
						flag = true;
						break;
					}
				}

				if (flag)
					System.out.println("\n\tStudent <" + studentName + "> removed successfully");
				else
					System.out.println("\n\tStudent not found in system");

				break;
			case "3": // Option to display all students and their grades
				System.out.println("\tStudents data: ");
				if (students.size() == 0) {
					System.out.println("\t\tNo data to display");
					break;
				}
				for (Student student : students)
					System.out.println("\t" + student.getName() + ", " + student.getGrade() + " GPA");

				break;
			case "4": // Option to calculate and display the average grade of students
				System.out.println("\tAverage grade of students");
				int totalScore = 0;
				for (Student student : students)
					totalScore += student.getGrade();

				if (students.size() > 0) {
					DecimalFormat df = new DecimalFormat("#.##");
					System.out
							.println("\tAverage grade of students: " + df.format((float) totalScore / students.size()));
				} else
					System.out.println("\tNo Data");
				break;
			case "5": // Option to exit the program
				break;
			default: // Handle invalid options
				System.out.println("\t\tINVALID OPTION PLEASE REENTER");
				break;
			}
		} while (!choice.equals("5"));  // Continue loop until user chooses to exit (option 5)

		sc.close();
	}

}
