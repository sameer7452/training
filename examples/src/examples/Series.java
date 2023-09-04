package examples;

public class Series extends Entertainment{
	
	private int Seasons;
	private String platform;
	private int subscription;
	
	public Series(String title, String language, String genre,int subscription,String platform,int Seasons) {
		super(title, language, genre);
		this.Seasons=Seasons;
		this.platform=platform;
		this.subscription=subscription;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Print() {
		
		super.Print();
		System.out.println("No of Seaons:"+Seasons+"\tPlatform:"+platform);
	}

	@Override
	public void buy() {
           System.out.println("The price of subscription to watch the series is:"+subscription+"\n");
	}

	@Override
	public String toString() {
		return "Series [Seasons=" + Seasons + ", platform=" + platform + ", subscription=" + subscription
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	

}
