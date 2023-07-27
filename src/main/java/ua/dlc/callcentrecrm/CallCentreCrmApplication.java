package ua.dlc.callcentrecrm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.dlc.callcentrecrm.dao.AbonentDAO;
import ua.dlc.callcentrecrm.model.Abonent;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class CallCentreCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallCentreCrmApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AbonentDAO abonentDAO) {

		return runner -> {
			createAbonent(abonentDAO);
			System.out.println("-------------------------------------------");
			createMultipleAbonents(abonentDAO);
			System.out.println("-------------------------------------------");
			readAbonent(abonentDAO);
			System.out.println("-------------------------------------------");
			queryForAbonents(abonentDAO);
			System.out.println("-------------------------------------------");
			queryForAbonentsByLastName(abonentDAO);
			System.out.println("-------------------------------------------");
		};
	}

	private void queryForAbonents(AbonentDAO abonentDAO) {

		// get a list of students
		List<Abonent> theAbonents = abonentDAO.findAll();

		// display list of students
		for (Abonent tempAbonent : theAbonents) {
			System.out.println(tempAbonent);
		}
	}

	private void queryForAbonentsByLastName(AbonentDAO abonentDAO) {

		// get a list of students
		List<Abonent> theAbonents = abonentDAO.findByLastName("Volkov");

		// display list of students
		for (Abonent abonent : theAbonents) {
			System.out.println(abonent);
		}
	}

	private void createAbonent(AbonentDAO abonentDAO) {

		// create the abonent object
		System.out.println("Creating new abonent object ...");
		Abonent tempAbonent = new Abonent("Ivan", "Sergiyovich", "Volkov");

		// save the abonent object
		System.out.println("Saving the abonent ...");
		abonentDAO.save(tempAbonent);

		// display id of the saved student
		System.out.println("Saved abonent. Generated id: " + tempAbonent.getId());
	}

	private void createMultipleAbonents(AbonentDAO abonentDAO) {

		// create multiple abonents
		System.out.println("Creating 3 abonent objects ...");
		Abonent tempAbonent1 = new Abonent("Ivan", "Sergiyovich", "Bezrukov");
		Abonent tempAbonent2 = new Abonent("Stepan", "Sergiyovich", "Bezrukov");
		Abonent tempAbonent3 = new Abonent("Maria", "Sergiivna", "Bezrukova");

		// save the abonent objects
		System.out.println("Saving the abonents ...");
		abonentDAO.save(tempAbonent1);
		abonentDAO.save(tempAbonent2);
		abonentDAO.save(tempAbonent3);
	}

	private void readAbonent(AbonentDAO abonentDAO) {

		// create the Abonent object
		System.out.println("Creating new Abonent object ...");
		Abonent tempSAbonent = new Abonent("Maria", "Sergiivna", "Bezrukova");

		// save the Abonent object
		System.out.println("Saving the Abonent ...");
		abonentDAO.save(tempSAbonent);

		// display id of the saved Abonent
		Long theId = tempSAbonent.getId();

		System.out.println("Saved Abonent. Generated id: " + theId);

		// retrieve Abonent based on the id: primary key
		System.out.println("Retrieving Abonent with id: " + tempSAbonent.getId());
		Abonent myAbonent = abonentDAO.findById(theId);

		// display student
		System.out.println("Found the Abonent: " + myAbonent);
	}
}
