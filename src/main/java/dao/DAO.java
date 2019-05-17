package dao;

import java.io.Serializable;

public interface DAO<T,E extends Serializable>{
    public T save(T object);
    public Boolean delete(T object);
    public T update(T object);
    public T find(E id);
}