package examples;

public class Game {

	private String name;
	private String device;
	private String genre;
	
	

	public Game(String name, String type, String genre) {
        System.out.println("\ngame object created");
		this.name = name;
		this.device = type;
		this.genre = genre;
	}
	
	public void details() {
		System.out.println("name:"+name+"\ndevice:"+device+"\ngenre:"+genre);
	}
	
	
	
}
