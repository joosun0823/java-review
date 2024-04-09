package final1;

public class Post {
	//필드
	private int id;
	private String title;
	private String content;
	
	//생성자
	public Post(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}


	//메소드 게터 세터
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
}
