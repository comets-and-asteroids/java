package org.example.pract17.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.persistence.Query;
import org.example.pract17.model.Footballer;
import org.example.pract17.model.Team;
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

    public List<Footballer> getFootballersOrderedByFirstName(){
        return session.createQuery("select p from Footballer p order by p.firstName", Footballer.class).list();
    }
    public List<Footballer> getFootballersOrderedByLastName(){
        return session.createQuery("select p from Footballer p order by p.lastName", Footballer.class).list();
    }
    public List<Footballer> getFootballersOrderedByTeamName(){
        return session.createQuery("select p from Footballer p order by p.team.name", Footballer.class).list();
    }
    public void deleteFootballer(long id) {

        session.beginTransaction();

        Footballer temp = session.load(Footballer.class, id);
        session.delete(temp);

        session.getTransaction().commit();
    }

    public Team getTeam(long id) {
        return getFootballer(id).getTeam();
    }
}
