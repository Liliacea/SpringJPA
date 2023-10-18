package hibernate.spring.dao;

import hibernate.spring.model.Person;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class PersonDao {
    @PersistenceContext
    private EntityManager em;

    public void persist(Person person){
        em.persist(person);
    }
    public List<Person> findAll() {

        return em.createQuery("SELECT p FROM Person p").getResultList();
    }

}


