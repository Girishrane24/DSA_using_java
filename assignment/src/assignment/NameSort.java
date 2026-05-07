package assignment;

import java.util.*;

class Person {
    private String name;
    private int id;
    
    
    public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
        return name;
    }


	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
    
	
}


public class NameSort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(5);
        
        System.out.println(people);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number  :");
        int n = s.nextInt();
        for(int i = 0; i < n ; i++)
        {
        	System.out.println("enter name : ");
        	String name = s.next();
        	
        	System.out.println("Enter id: ");
        	int id = s.nextInt();
        	
        	// add using collection framework:
        	people.add(new Person(name,id));
        }
        
        
//        people.add(new Person("Ravi",1));
//        people.add(new Person("Amit",6));
//        people.add(new Person("Neha",22));
//        people.add(new Person("Girish",16));
//        
        
        // Sort using Java 8 Comparator.comparing (recommended)
        people.sort(Comparator.comparing(Person::getName));
        
        System.out.println("After sorting by name: " + people);
        
        // For descending order
//        people.sort(Comparator.comparing(Person::getName).reversed());
//        System.out.println("Descending: " + people);
        
        s.close();
    }
}