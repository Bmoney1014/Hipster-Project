package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
		setupBooks();
	}
	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound lke a hipster but, ";
		hipsterPhrases[2] = "Insert sarcasm here";
		hipsterPhrases[3] = "I was into XXXXX before it was cool.";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Stephen King");
		firstBook.setTitle("The Shining");
		firstBook.setSubject("Psychological Horror");
		firstBook.setPageCount(447);
		firstBook.setPrice(6.00);
		
		secondBook = new Book();
		secondBook.setAuthor("Cay Hortsman");
		secondBook.setTitle("Big Java");
		secondBook.setSubject("Computer Science");
		secondBook.setPageCount(1000);
		secondBook.setPrice(90.00);
		
		thirdBook = new Book();
		thirdBook.setAuthor("Jeff Hirch");
		thirdBook.setTitle("The Eleventh Plague");
		thirdBook.setSubject("Post Apocalyptic");
		thirdBook.setPageCount(288);
		thirdBook.setPrice(9.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
		
	}
	
	public Hipster(String name)
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}
	
	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
	
	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}
	
	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
}
