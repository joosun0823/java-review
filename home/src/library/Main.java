package library;

public class Main {
	public static void main(String[] args) {
		Library li = new Library();
		Member m1 = new Member("김주선", "01012311231", "강남구");
		Member m2 = new Member("김호로", "01013311331", "서초구");
	
		li.join(m1);
		li.join(m2);
		
		Book b1 = new Book("울라라");
		Book b2 = new Book("훌라라");
		
		li.bookRegister(b1);
//		li.bookRegister(b2);
		
		li.showLibraryBookList();

		li.bookRental(0, m1);
		li.showLibraryMemberList();
		li.showLibraryBookList();
		
		li.bookReturn(0, m1);
		
	}
}
