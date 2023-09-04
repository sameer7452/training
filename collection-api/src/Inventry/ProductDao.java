package Inventry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Streams.Flight;

public class ProductDao {

	private List<Product> products;

	public ProductDao() {
		try {
		Stream<String> lines=Files.lines(Paths.get("src/products.txt"));
      products = lines.map(line->{
			String[] record = line.split(",");
			return new Product(Integer.parseInt(record[0]),record[1],Double.parseDouble(record[2]));
}).collect(Collectors.toList());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void add(Product p) {
		products.add(p);
	}

	public Product find(int code) {
		return products.stream().filter(p -> p.getCode() == code).findFirst().get();
	}

	public List<Product> list() {
		return products;
	}

	public void delete(int code) {
		products.removeIf(p -> p.getCode() == code);
	}
}
