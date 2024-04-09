package library;

public class Main {
	public static void main(String[] args) {
		Library li = new Library();
		Member m1 = new Member("김주선", "01012341234", "강남구");
		Member m2 = new Member("기무라", "01023121231", "송파구");
		li.join(m1);
		li.join(m2);
		
		
		Book b1 = new Book("돼지");
		Book b2 = new Book("아기돼지");
		li.bookRegister(b1);
		li.bookRegister(b2);
		
		li.showLibraryBookList();
		
		li.bookRental(0, m1);
		li.showLibraryMemberList();
		li.showLibraryBookList();
		
		System.out.println();
		System.out.println();
		
		System.out.println("=============");
		System.out.println();
		System.out.println();
		System.out.println();
		li.bookReturn(0, m1);
		li.showLibraryMemberList();
		li.showLibraryBookList();
		

		
	}
}
