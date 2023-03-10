package com.coredev.tasks.Task1DBOps.repository;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;


public class BaseRepository<T> {
    private static EntityManagerFactory factory;
    private EntityManager entityManager;
    private Class<T> clazz;
    public BaseRepository(Class<T> clazz){
        this.clazz=clazz;
        entityManager=newManager();
    }

    protected static EntityManagerFactory getFactory() {
        if(factory==null){
            factory=Persistence.createEntityManagerFactory("MyPersistenceUnit");
            System.out.println("Factory Created");
        }
        return factory;
    }

    public EntityManager newManager(){
        return getFactory().createEntityManager();
    }
    
    public void close() {
    	entityManager.close();
    }

    public void insert(T entity){
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void update(T entity){
        EntityManager entityManager=newManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(T entity){
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public T find(long id){
        T entity=entityManager.find(clazz, id);
        return entity;
    }

    private static final String SELECT="select e from %s e";
    public List<T> list(){
        String jpql=String.format(SELECT, clazz.getSimpleName());
        TypedQuery<T> query=entityManager.createQuery(jpql,clazz);
        List<T> entities=query.getResultList();
        return entities;
    }

}
