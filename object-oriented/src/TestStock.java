import com.ey.stock.Broker;
import com.ey.stock.Exhange;
import com.ey.stock.StockSingleton;
import com.ey.stock.holder;
import com.ey.stock.stock;

public  final class TestStock {

	private TestStock() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {

		
		holder h = StockSingleton.getStock();
		h.viewQuote();
		
		Broker b = StockSingleton.getStock();
		b.viewQuote();
		b.getQuote();
		
		Exhange e = StockSingleton.getStock();
		e.viewQuote();
		e.getQuote();
		e.setQuote();
		
		System.out.println(h==b);
		System.out.println(b==e);
	}
}
