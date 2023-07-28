package ua.dlc.callcentrecrm;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.dlc.callcentrecrm.dao.AbonentDao;
import ua.dlc.callcentrecrm.model.Abonent;

@SpringBootApplication
@EnableJpaRepositories
public class CallCentreCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CallCentreCrmApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AbonentDao abonentDao) {

        return runner -> {
            createAbonent(abonentDao);
            System.out.println("-------------------------------------------");
            createMultipleAbonents(abonentDao);
            System.out.println("-------------------------------------------");
            readAbonent(abonentDao);
            System.out.println("-------------------------------------------");
            queryForAbonents(abonentDao);
            System.out.println("-------------------------------------------");
            queryForAbonentsByLastName(abonentDao);
            System.out.println("-------------------------------------------");
        };
    }

    private void queryForAbonents(AbonentDao abonentDao) {

        // get a list of students
        List<Abonent> theAbonents = abonentDao.findAll();

        // display list of students
        for (Abonent tempAbonent : theAbonents) {
            System.out.println(tempAbonent);
        }
    }

    private void queryForAbonentsByLastName(AbonentDao abonentDao) {

        // get a list of students
        List<Abonent> theAbonents = abonentDao.findByLastName("Volkov");

        // display list of students
        for (Abonent abonent : theAbonents) {
            System.out.println(abonent);
        }
    }

    private void createAbonent(AbonentDao abonentDao) {

        // create the abonent object
        System.out.println("Creating new abonent object ...");
        Abonent tempAbonent = new Abonent("Ivan", "Sergiyovich", "Volkov");

        // save the abonent object
        System.out.println("Saving the abonent ...");
        abonentDao.save(tempAbonent);

        // display id of the saved student
        System.out.println("Saved abonent. Generated id: " + tempAbonent.getId());
    }

    private void createMultipleAbonents(AbonentDao abonentDao) {

        // create multiple abonents
        System.out.println("Creating 3 abonent objects ...");
        Abonent tempAbonent1 = new Abonent("Ivan", "Sergiyovich", "Bezrukov");
        Abonent tempAbonent2 = new Abonent("Stepan", "Sergiyovich", "Bezrukov");
        Abonent tempAbonent3 = new Abonent("Maria", "Sergiivna", "Bezrukova");
        abonentDao.save(tempAbonent1);
        abonentDao.save(tempAbonent2);
        abonentDao.save(tempAbonent3);
    }

    private void readAbonent(AbonentDao abonentDao) {

        // create the Abonent object
        System.out.println("Creating new Abonent object ...");
        Abonent tempSAbonent = new Abonent("Maria", "Sergiivna", "Bezrukova");

        // save the Abonent object
        System.out.println("Saving the Abonent ...");
        abonentDao.save(tempSAbonent);

        // display id of the saved Abonent
        Long theId = tempSAbonent.getId();

        System.out.println("Saved Abonent. Generated id: " + theId);

        // retrieve Abonent based on the id: primary key
        System.out.println("Retrieving Abonent with id: " + tempSAbonent.getId());
        Abonent myAbonent = abonentDao.findById(theId);

        // display student
        System.out.println("Found the Abonent: " + myAbonent);
    }
}
