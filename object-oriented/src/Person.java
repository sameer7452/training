
public class Person {
     private String name;
     private int age;
     
     public Person() {
    	 //constructor chaining
    	 this("anonymus",-1); //calling another constructor with matching signature
    	 
	}
     
     public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

     
     public void print() {
    	 System.out.println("name:"+name+"\tage:"+age);
     }
     
  //   @Override
	//public String toString() {
		//return "name:"+name+"\tage:"+age;
	//}

	public static void main(String[] args) {
    	//Declaration=instantiation 
		Person p1 = new Person("polo", 21);
		p1.print();
				
		Person p2 = new Person();
		p2.print();
		
		System.out.println(p1.hashCode());
		System.out.println(p1); // calling the toString()
		System.out.println(p1.toString());
		
		Person p3=new Person("polo",21);
		System.out.println(p3);
		
		System.out.println(p1.equals(p3));
		}

	
	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Person p) {
        	//Person p=(Person) obj;
        	if(this.age==p.age&&name.equals(p.name))
        		return true;
        }
        return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
