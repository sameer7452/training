package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {

	
		
		private List<Flight> flights=null;
		
		public FlightStreamDemo() {
		try {
			Stream<String> lines=Files.lines(Paths.get("src/flights.txt"));
			
			flights=lines.map(Line->{
					String[] record = Line.split(",");
					return new Flight(Integer.parseInt(record[0]),record[1],record[2],record[3]);
}).collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		public void add(Flight f) {
			flights.add(f);
		}
		
		public void delete(int code) {
			flights.removeIf(f->f.getCode()==code);
		}
		
		public List<Flight> list (){
			return flights;
		}
		
		public void findBySrcDes(String Src,String Des) {
			flights.stream().filter(f->f.getSource().equals(Src)&&f.getDestination().equals(Des)).forEach(System.out::println);
		}
	//flights.forEach(System.out::println);
	
	//Print details of flight no 123
	//System.out.println(flights.stream().filter(f->f.getCode()==123).findFirst().get());
	
	//print all the files by jet carrier
	//flights.stream().filter(f->f.getCarrier().equals("Jet")).collect(Collectors.toList()).forEach(System.out::println);
	
	//flights.stream().filter(f->f.getSource().equals("Pune")&&f.getDestination().equals("Delhi")).forEach(System.out::println);
	
//	flights.removeIf(f->f.getCode()==123);
//	
//	flights.forEach(System.out::println);
		
		
	
}
