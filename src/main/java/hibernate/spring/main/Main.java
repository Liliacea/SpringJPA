package hibernate.spring.main;

import hibernate.spring.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");
        PersonService personService = ctx.getBean(PersonService.class);
    }
}
