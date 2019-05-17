package entity;

import javax.persistence.*;

@Entity
@Table(name = "person")
@NamedQueries
        (
                {
                        @NamedQuery(name = Person.GET_PERSON_BY_AGE, query = "Select * from  User u where u.age>:age")

                })
public class Person {

    public static final String GET_PERSON_BY_AGE =
            "Person.getPersonByAge";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    public int id;
    @Column(name = "name")
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}