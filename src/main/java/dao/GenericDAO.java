package dao;

import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class GenericDAO<T, E extends Serializable> implements DAO<T, E> {

    protected EntityManager entityManager;

    public T save(T object) {
        entityManager.persist(object);
        return object;
    }

    public T find(Class<T> clazz, E id) {
        T object;
        object = entityManager.find(clazz, id);
        return object;
    }

    public Boolean delete(T object) {
        entityManager.remove(object);
        return true;
    }

    public T update(T object) {
        return entityManager.merge(object);
    }
}