package ctstraining;

public class book {
	String name, author_name;
	double price;
	public BookDetails() {
	}
	public BookDetails(String name, String author_name, long price) {
		super();
		this.name = name;
		this.author_name = author_name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<BookDetails> getAllBooks() {
		return books;
		}
	static ArrayList<BookDetails> books = null;
	public void addBook(BookDetails book) {
		books.add(book);
}
	public static void main() {
		BookDetails b = new BookDetails();
		int choice = 0;
		System.out.println("Plese Enter your Choice\n\t1: Add a book\n\t2: Display All Books");
		while(choice != 3){
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice) {
			case 1:
			case 2:
			}
		}
	}
