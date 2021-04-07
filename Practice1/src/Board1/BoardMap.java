package Board1;

public class BoardMap {

	private String title;
	private String writer;
	private String contents;
	
	public BoardMap() {}
	
	public BoardMap(String title, String writer, String contents) {
		super();
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	
}
