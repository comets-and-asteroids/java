package org.example.pract15.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.pract15.model.Footballer;
import org.example.pract15.model.Team;
import org.example.pract15.repository.FootballerRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FootballerService {
    @Autowired
    private final SessionFactory sessionFactory;

    public FootballerService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;

    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
    }

    @PreDestroy
    public void unSession() {
        session.close();
    }

    public void addFootballer(Footballer footballer) {
        session.beginTransaction();
        session.saveOrUpdate(footballer);
        session.getTransaction().commit();
    }

    public List<Footballer> getFootballers() {
        return session.createQuery("select p from Footballer p", Footballer.class).list();
    }

    public Footballer getFootballer(long id) {
        return session.createQuery("select p from Footballer p where p.id = " + id, Footballer.class).getSingleResult();
    }

    public void deleteFootballer(long id) {

        session.beginTransaction();

        Footballer temp = session.load(Footballer.class, id);
        session.delete(temp);

        session.getTransaction().commit();
    }
}
