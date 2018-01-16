
public class Book {
	private String Name;
	private String AuthorName;
	private int YearPublication;
	
	public Book(String Name, String AuthorName, int YearPublication) {
		this.Name = Name;
		this.AuthorName = AuthorName;
		this.YearPublication = YearPublication;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public String getAuthorName() {
		return this.AuthorName;
	}
	
	public int getYearPublication() {
		return this.YearPublication;
	}
}
