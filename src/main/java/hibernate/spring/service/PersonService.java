package hibernate.spring.service;

import hibernate.spring.dao.PersonDao;
import hibernate.spring.model.Person;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PersonService {

    @Autowired
    private PersonDao personDao;


    public void add(Person person) {
        personDao.persist(person);
    }


    public void addAll(Collection<Person> persons) {
        for (Person person : persons) {
            personDao.persist(person);
        }
    }


    public List<Person> listAll() {
        return personDao.findAll();

    }

}