package br.com.jbusiness.person.services;

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
}
