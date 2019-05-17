package dao;

import entity.Person;

import javax.persistence.Query;
import java.util.List;

public class PersonDAO extends GenericDAO<Person, Integer>{

public List<Person> getPersonByAge(int age){
        Query q= entityManager.createNamedQuery(Person.GET_PERSON_BY_AGE);
        q.setParameter("age",5);
        return(List<Person>)q.getResultList();
        }

    public Person find(Integer id) {
        return null;
    }
}
