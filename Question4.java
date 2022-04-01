package Assignment2;

public class Question4 {
	int bookId;
	String bookName;
	

	public Question4(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public void display()
	{
		System.out.println("BookId:"+bookId+"BookName:"+bookName);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 book1=new Question4(1,"aris");
		Question4 book2=new Question4(2,"bris");
		book1.display();
		book2.display();
		System.out.println(book1.equals(book2));


		
		

	}

}
