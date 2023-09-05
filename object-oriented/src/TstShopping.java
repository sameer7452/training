import com.ey.shop.CartException;
import com.ey.shop.Product;
import com.ey.shop.ShoppingCart;

public class TstShopping {

	public static void main(String[] args) {
		
		ShoppingCart cart =new ShoppingCart();
		
		Product p1=new Product("iphone X",23000);
		try {
			cart.addToCart(p1);
		} catch (CartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cart.addToCart(new Product("airpods",8999));
		} catch (CartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cart.addToCart(new Product("apple wathc se",33000));
		} catch (CartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cart.addToCart(new Product("apple wathc se",33000));
		} catch (CartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cart.addToCart(new Product("apple wathc se",33000));
		} catch (CartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cart.addToCart(new Product("apple wathc se",33000));
		} catch (CartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		
		cart.checkout();
	}
}
