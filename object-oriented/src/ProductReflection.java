import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.ey.shop.Product;

public class ProductReflection {

	public static void main(String[] args)  throws Exception{

//		Product p1 =new Product("parker",120);
//		p1.print();
//		System.out.println(p1);
//		
//		Class pc=p1.getClass();
		
		//it loads a java class manually is memory
		Class pc=Class.forName("com.ey.shop.Product");
		
		System.out.println(pc.getName());
		System.out.println(pc.getPackageName());
		System.out.println(pc.getSimpleName());
		
		System.out.println("list of construtors:");
		Constructor[] constructors=pc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println("list of methods:");
		Method[] methods=pc.getMethods();
		for(Method m:methods)
			System.out.println(m);
		
		System.out.println("list of declared methods");
		Method[] decMethods=pc.getDeclaredMethods();
		for(Method m:decMethods)
			System.out.println(m);
		
		System.out.println("list of fields declared:");
		Field[] fields=pc.getFields();
		for(Field f:fields)
			System.out.println(f);
		
		System.out.println("list of declared fields :");
		Field[] decfields=pc.getDeclaredFields();
		for(Field f:decfields)
			System.out.println(f);
	}
}
