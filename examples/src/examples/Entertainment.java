package examples;

public abstract class Entertainment {
	
	private String title;
	private String language;
	private String genre;
	//private int amount;
	
	public Entertainment() {
	}
	
	public Entertainment(String title, String language, String genre) {
		this.title = title;
		this.language = language;
		this.genre = genre;
	}
	
	public void Print() {
		System.out.println("Title:"+title+"\tLanguage:"+language+"\tgenre:"+genre);
	}
	
	public void buy() {
		
	}
	
	

}
