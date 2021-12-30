package br.com.jbusiness.person.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.jbusiness.person.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Rodrigo");
		person.setLastName("Sturm");
		person.setAddress("Curitiba - PR");
		person.setGender("Male");
		return person;
	}
	
	public Collection<Person> findAll() {
		
		int count = 0;
		Person person;
		Collection<Person> persons = new ArrayList<Person>();
		
		while(count < 10) {
			
			person = new Person();
			person.setId(counter.incrementAndGet());
			person.setFirstName("Name " + count);
			person.setLastName("Last Name " + count);
			person.setAddress("Address "  + count);
			person.setGender("Male " + count);
			
			persons.add(person);
			
			count++;
			
		}
		
		return persons;
		
	}
}
