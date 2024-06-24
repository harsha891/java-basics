import java.util.Scanner;

//Book class to represent a book with title, author, and price
class Book {
	private String title;
	private String author;
	private double price;

	// Constructor to initialize a Book object with title, author, and price
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// Method to display the details of the book
	public void displayBook() {
		System.out.println("Title : " + this.title);
		System.out.println("Author : " + this.author);
		System.out.println("Price : " + this.price + "$\n");
	}

	// Method to apply a discount to the book price
	public void applyDiscount(double discount) {
		System.out.println("Initial price : " + this.price + "$\n");
		this.price = this.price * (1 - (discount / 100));
		System.out.println("After discount : " + this.price + "$\n");
	}

}

//Main class LibrarySystem to demonstrate the Book class
public class LibrarySystem {

	public static void main(String[] args) {
		// Creating instances of Book
		Book mathBook = new Book("Mathmetics Algebra", "L Cooper", 149.99);
		Book scienceBook = new Book("Space Science", "ALfredo", 99.99);

		// Display details of mathBook
		mathBook.displayBook();

		// Applying discount to scienceBook based on user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Discount : ");
		scienceBook.applyDiscount(sc.nextDouble());

		// Display updated details of mathBook after discount applied to scienceBook
		mathBook.displayBook();

		sc.close();
	}

}
